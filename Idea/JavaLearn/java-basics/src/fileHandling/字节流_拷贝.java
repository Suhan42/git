package fileHandling;

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
            // 这里可以输入输出任何格式的文件，因为是字节流
            in = new FileInputStream("java-basics/fileHandingDemo/file1.rar");
            out = new FileOutputStream("java-basics/fileHandingDemo/file字节拷贝.rar"); //不会自动生成文件夹

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

