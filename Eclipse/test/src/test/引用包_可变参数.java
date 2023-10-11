package test;
//4.9
import p1.p2.p3.In_p3;//引用别的类库

public class 引用包_可变参数 {
	
	static void out(int ...x) {
		for(int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
	}
	
	public static void main(String []args) {
		out(1,2,3);
		In_p3 p = new In_p3();
		p.printf();
	}
}