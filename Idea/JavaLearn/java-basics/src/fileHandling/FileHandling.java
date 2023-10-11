package fileHandling;

import java.io.File;
import java.io.IOException;

/*
The File class from the java.io package, allows us to work with files.
java.io 包中的 File 类允许我们使用文件。

To use the File class, create an object of the class, and specify the filename or directory name:
若要使用该类，请创建该 File 类的对象，并指定文件名或目录名称：

*/
public class FileHandling {
    public static void main(String[] args) {
//        File f = new File("java-basics/fileHandingDemo/file1.txt"); 位置是以项目位置作为根位置
        File f = new File("D:\\study\\java\\JavaLearn\\java-basics\\fileHandingDemo","file1.txt");
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
