package test;
//4.20 4.23
public class 子类父类 extends Object {
	public static void main(String []args) {
		
		Object o1 = new Object();
		//如果o1 = 1; 就输出内容
		
		//to.String()是自动调用的
		System.out.println(o1.toString());
		//java.lang.Object@15db9742 这后面是地址
		Object t1 = new 子类父类();
		System.out.println(t1);
		
		Son boy = new Son(2);
		boy.setfa(3);
		boy.out();
		
		boy.setf(5);
		boy.out();
		
	}
}

class Father {
	private int fa;
	int f;
	void setfa(int fa){
		this.fa=fa;
	}
	void out() {
		System.out.println("fa is:"+fa);
	}
}


class Son extends Father{
	int s;
	
//父类里面已经有了 f，这里又定义了，就是 覆盖（Override）（成员变量的隐藏）
	
	int f=123;	
	
	Son(){}
	Son(int s){
		this.s=s;
	}
	void setf(int f){
		super.f=f;	//super操作被隐藏的，只能往上一层父类
	}
	
//方法也有 方法重写	
	void out() {
		System.out.println("s is:"+s);
		System.out.println("f is:"+super.f);
	}
	
}