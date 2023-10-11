package basics;
import java.util.Scanner;
/*java 类
OOP stands for Object-Oriented Programming.
OOP 代表 面向对象编程。
类名一般用首字母大写


内部类（inner class）
In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.
在Java中，也可以嵌套类（类中的类）。嵌套类的目的是将属于一起的类分组，这使代码更具可读性和可维护性。
To access the inner class, create an object of the outer class, and then create an object of the inner class。
若要访问内部类，请创建外部类的对象，然后创建内部类的对象。


计算梯形面积：调用类里面的static方法
* */
public class S5_classes {

    //成员变量，在堆，有默认值为0
    //实例变量，每个对象都有单独的一份
    int height;
    //静态变量，只有一份，变一个都变
    static int above;//上底
    static int bottom;//下底

    //方法也有静态非静态之分，静态方法内只能调用静态变量（例如main），非静态都可以调用
    void setheight(int height) {
        this.height=height;//常用方式
    }

    int putnum(){ return (above+bottom)*height/2;
    }


    public static void main(String[] args) {
        //局部变量，在栈
        String str="请输入上底、下底、高：";
        //三种变量输出
        S5_classes hc=new S5_classes();
        System.out.print(hc.height);
        System.out.println(above);
        System.out.println(str);

        //计算面积
        Scanner win =new Scanner(System.in);
        above=win.nextInt();
        bottom=win.nextInt();
        int x=win.nextInt();
        win.close();
        hc.setheight(x);

        System.out.println(hc.putnum());

//        方法的使用和变量类似，如果单用一个非静态方法，可以：
//        System.out.println((new S5_classes()).putnum());
    }
}
