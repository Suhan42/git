package test;
//3.30
import java.util.Scanner;
	//计算梯形面积

public class Class1 {		//类名一般用首字母大写
	
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
	
	int putnum(){
		return (above+bottom)*height/2;
	}
	
	
	public static void main(String[] args) {
		//局部变量，在栈
		String str="请输入上底、下底、高：";
		//三种变量输出
		Class1 hc=new Class1();
		System.out.print(hc.height);
		
		System .out.print(above);
		
		System.out.println(str);
		
		//计算面积
		Scanner win =new Scanner(System.in);
		above=win.nextInt();
		bottom=win.nextInt();
		int x=win.nextInt();
		win.close();
		hc.setheight(x);
		
		System.out.println(hc.putnum());
		
		//方法的使用和变量类似，如果单用一个非静态方法，可以：
		System.out.println((new Class1()).putnum());
	}
}
