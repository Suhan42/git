package fileHandling;

import java.io.*;

public class 字节流_切割 {

    public static void main(String[] args) {
        int bufSize = 1024*100; //1024就是1k，这里乘100
        byte[] buf = new byte[bufSize];
        InputStream in = null;
        OutputStream out = null;
        int len = -1;
        int count;


        //切割
        try {
            in = new FileInputStream("java-basics/fileHandingDemo/file1.rar");
            count = 1;
            while((len = in.read(buf)) != -1) {
                out = new FileOutputStream("java-basics/fileHandingDemo/file."+count);
                out.write(buf, 0 ,len);
                out.close();
                count++;
            }
            in.close();

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("切割 Success");



        //合并
        try {
            count = 1;
            out = new FileOutputStream("java-basics/fileHandingDemo/file切割.rar");

            while(count<=8) {
                in = new FileInputStream("java-basics/fileHandingDemo/file."+count);
                len = in.read(buf);
                out.write(buf, 0 ,len);

                in.close();
                count++;
            }
            out.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("合并 Success");


    }

}

