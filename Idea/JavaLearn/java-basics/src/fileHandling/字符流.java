package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


public class 字符流 {
    public static void main(String[] args) {
        File sourceFile = new File ("java-basics/fileHandingDemo/file1.txt");		//读取的文件
        File targetFile = new File ("java-basics/fileHandingDemo/file字符流.txt");		//写入的文件

        char c[] =new char[19] ;

        try {
            Writer out = new FileWriter(targetFile, true);		//ture表示加在末尾
            @SuppressWarnings("resource")
            Reader in= new FileReader(sourceFile);				//指向源的输入流

            int n = -1;
            while((n=in.read(c)) !=-1) {
                out.write(c,0,n);
            }
            out.flush();	//将缓存中的数据清空（指导入外存中）
            out.close();	//close就包括了flush
            System.out.println("success");
        }catch (IOException e) {
            System.out.println("Error:"+e);
        }

    }
}
