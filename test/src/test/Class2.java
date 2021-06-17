package test;
//4.2
public class Class2 {
	public static void main(String []args) {
		
		Class2_1 la = new Class2_1();//引用隔壁的类
		Class2_1 la2 = new Class2_1(4, 5, 6);
		
		System.out.println(la.outarea());
		System.out.println(la2.outarea());
		
	}
}