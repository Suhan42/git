package 输入_输出流;
//5.28
import java.io.File;
import java.io.IOException;

public class 文件操作 {
	public static void main(String[] args) {
		File f = new File("D:\\workspace\\test","example.txt");
		if(f.exists()) {
			System.out.println(f.getName()+"是可读的吗："+f.canRead());
			System.out.println(f.getName()+"的长度："+f.length());
			System.out.println(f.getName()+"的绝对路径："+f.getAbsolutePath());
		}
		
		File f2 = new File("new.txt");
		try {
			f2.createNewFile();		//创建新文件
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if(f2.exists()) 
			System.out.println(f2.getName()+"是可读的吗："+f2.canRead());
		f2.delete();		//删除文件
		if(!f2.exists()) 
			System.out.println(f2.getName()+"不存在");
		
		
		
//打开记事本
		Runtime ce = Runtime.getRuntime();
		File n = new File("C:/windows","Notepad.exe");
		try {
			ce.exec(n.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
