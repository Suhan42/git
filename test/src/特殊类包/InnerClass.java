package 特殊类包;
//5.7

//这是外部类
public class InnerClass {
	A aa;	//内部类声明对象
	B bb;
	InnerClass(){
		aa = new A(2);
		bb = new B(4);
	}
	
	void outclass() {
			aa.out();
			bb.out();
	}

//内部类声明、成员类
	class A{
		int a;
		A(int n){
			a=n;
		}
		void out() {
			System.out.println(a);
		}
	}

//非内部类不可以是静态（staric）类
//静态内部类
	static class B{
		int b;
		B(int n){
			b = n;
		}
		void out() {
			System.out.println(b);
		}
	}
}

//匿名类（只有类体，没有类声明）
abstract class Anonymous{
	void out() {}
}
