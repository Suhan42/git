package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.StringTokenizer;

public class 字符流_缓冲流{
    public static void main(String args[]) {

        File fRead = new File("java-basics/fileHandingDemo/file1.txt");

        File fWrite = new File("java-basics/fileHandingDemo/file字符缓冲.txt");

        try{
            Writer out = new FileWriter(fWrite);
            BufferedWriter bufferWrite = new BufferedWriter(out);		//out缓冲输出流

            Reader in = new FileReader(fRead);
            BufferedReader bufferRead = new BufferedReader(in);			//in缓冲输入流

            String str = null;

            while( (str=bufferRead.readLine()) !=null) {				//readLine方法读取文件内容
                StringTokenizer fenxi = new StringTokenizer(str);
                int count = fenxi.countTokens();
                str = str+"\n:句子中单词个数:"+count;
                System.out.println(str);
                bufferWrite.write(str);
                bufferWrite.newLine();
            }

            bufferWrite.close();
	/*
			out.close();
			in = new FileReader (fWrite);
			bufferRead = new BufferedReader(in);
			String s=null;
			System.out.println(fWrite.getName()+"内容:");
			while((s=bufferRead.readLine())!=null) {
				System.out.println(s);
			}
*/
            bufferRead.close();
            in.close();

        }catch(IOException e) {
            System.out.println(e.toString());
        }
    }

}
