import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowMain {
	
	FileChooser sqlchooser  = new FileChooser ();
	FileChooser saveChooser  = new FileChooser ();
	String beanName;
	JButton open =new JButton("open");
	JButton save =new JButton("save path");
	ConvertButton convert =new ConvertButton("convert");
	
	public static void main1(String[] args) {
		System.out.println("hello");
		JFrame frame = new JFrame("第一个JFrame");
		frame.setSize(288, 188);
		// 显示该Frame
		frame.setVisible(true);
		
		
		//添加文件选择，获取输入文件路径
		JFileChooser fc=new JFileChooser();  
		fc.setDialogTitle("Open class File"); 
		int returnVal =fc.showDialog(new JLabel(), "选择");  
		//如果用户选择了文件，并点击了"Opne/打开"按钮，显示用户选择的文件全名路径，  
		//如果用户点击"Close/关闭"按钮，以及其它方式退出文件选择框，则什么也不做。  
		  if (returnVal == JFileChooser.APPROVE_OPTION){  
		   File file = fc.getSelectedFile();  
		   System.out.println(file.getPath());  
		  }  
	}
	
	public static void main(String [] args){
		WindowMain window = new WindowMain();
		window.init();
		System.out.println(window.saveChooser.path);
		
		
		
	}
	
	public void init(){
		JFrame frame = new JFrame("第一个JFrame");
		
		JPanel panel=new JPanel(); 
		frame.setSize(288, 188);
		
		frame.setLocationRelativeTo(null);
		BoxLayout layout=new BoxLayout(panel, BoxLayout.X_AXIS); 
		// 显示该Frame
		frame.setVisible(true);
		
		panel.add(open);
		panel.add(save);
		panel.add(convert);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		open.addActionListener(sqlchooser);
		save.addActionListener(saveChooser);
		
		//转化button
		convert.addActionListener(convert);
		//
		
		convert.setSaveChooser(saveChooser);
		convert.setSqlchooser(sqlchooser);
	}

}

class FileChooser implements ActionListener{
	String path = null;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser jfc=new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
		jfc.showDialog(new JLabel(), "选择");
		File file=jfc.getSelectedFile();
		if(null == file){
			return ;
		}
		if(file.isDirectory()){
			System.out.println("文件夹:"+file.getAbsolutePath());
		}else if(file.isFile()){
			System.out.println("文件:"+file.getAbsolutePath());
		}
		System.out.println(jfc.getSelectedFile().getName());
		path = file.getAbsolutePath();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}

class ConvertButton extends JButton implements ActionListener{
//	private String input;
//	private String output;
//	private String beanName;
	FileChooser sqlchooser ;
	FileChooser saveChooser ;
	
	
	public ConvertButton(String name){
		super(name);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//
		MYSQLGRAMMARWalkerMain walkerMain = new MYSQLGRAMMARWalkerMain();
		//String output = "E:\\eclipseAntlr\\sql2beantool\\src\\";
		//E:\eclipseAntlr\sql2beantool\src
		try {
			walkerMain.handleSql(sqlchooser.getPath(), saveChooser.getPath(), "Demo");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	public FileChooser getSqlchooser() {
		return sqlchooser;
	}

	public void setSqlchooser(FileChooser sqlchooser) {
		this.sqlchooser = sqlchooser;
	}

	public FileChooser getSaveChooser() {
		return saveChooser;
	}

	public void setSaveChooser(FileChooser saveChooser) {
		this.saveChooser = saveChooser;
	}
	
}


