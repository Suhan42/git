package test;
//4.6
public class Class组合和复用 {
	public static void main(String []args) {
		SIM s1 = new SIM("19510187956");
		SIM s2 = new SIM("110-120-119");
		Phone p = new Phone();
		p.setSIM1(s1);
		p.setSIM2(s2);
		p.getPhone1();
		p.getPhone2();
	}
}
//双卡手机
class Phone{
	SIM sim1, sim2;
	void setSIM1(SIM sim1) {
		this.sim1 = sim1;
	}
	void setSIM2(SIM sim2) {
		this.sim2 = sim2;
	}
	void getPhone1() {
		sim1.getSIM();
	}
	void getPhone2() {
		sim2.getSIM();
	}
}
//SIM卡
class SIM{
	String h;
	SIM(String h){
		this.h = h;
	}
	
	void getSIM() {
		System.out.println(h);
	}
}