package 输入_输出流;
//6.1
import java.io.*;

public class 字节流_拷贝 {

	//将一个文件拷贝到另一个文件
	public static void main(String[] args) {
		int bufSize = 1024;
		byte[] buf = new byte[bufSize];
		InputStream in = null;
		OutputStream out = null;
		int len = -1;
		
		try {
			in = new FileInputStream("./demo\\src\\233.rar");
			out = new FileOutputStream("./demo\\des\\3.rar");//不会自动生成文件夹
			
			long start = System.currentTimeMillis();//计时器
			
			while( (len = in.read(buf)) != -1) {
				out.write(buf, 0, len);
			}
			
			in.close();
			out.close();
			
			long elapse = System.currentTimeMillis()-start;
			
			System.out.println("Success, what it space time is:"+elapse);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
