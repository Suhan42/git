package fileHandling;


import java.io.*;

public class 字节流 {
    public static void main(String[] args) throws IOException {

        int n=-1;
        byte []a=new byte[10];

        File f = new File("java-basics/fileHandingDemo/file1.txt");

        //输出流 是往文件内输入
        byte []bit = "hello world!".getBytes("UTF-8");			//getBytes把前面转换成字节，使用utf-8
        //FileOutputStream是OutputStream的子类，字节输出流
        OutputStream out = new FileOutputStream(f);		//这里后面加上true指的是在原有文本后面添加内容，不然会覆盖原有数据
        System.out.println(f.getName()+"现在的大小是："+f.length()+"字节");
        out.write(bit);		//写入内容
        out.close();		//关闭输出流



        //输入流 是从文件往外读取
        @SuppressWarnings("resource")
        InputStream in = new FileInputStream(f);		//FileInputStream是InputStream的子类，字节输入流
        while( (n=in.read(a,0,10)) != -1) {				//从0到10
            String s = new String(a,0,n);
            System.out.print(s);
        }

    }
}
