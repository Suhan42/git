package test;
//4.2
public class Class2_1 {

		int h;
		int a;
		int b;
		public Class2_1() {
			h=2;
			a=3;
			b=4;
		}
		public Class2_1(int h, int a, int b) {
			this.h=h;
			this.a=a;
			this.b=b;
		}
		int outarea() {
			return (a+b)*h/2;
		}

}
