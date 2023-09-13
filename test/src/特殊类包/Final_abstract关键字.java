package 特殊类包;
//4.25
public class Final_abstract关键字 {
	public static void main(String []args) {
		//final常量
		final String a = "19510187956";
		Si SIM = new Mobile();
		SIM.setNumber(a);
		System.out.println(SIM.giveN() );
		System.out.println(SIM.giveCorpName() );
	}
}

//抽象类
abstract class Si{
	/* 1.不能用 new 来创建对象，但可以将其对象做 上转型对象（使用子类）
	 * 2.抽象类里面可以有抽象方法（abstract方法）,也可以没有
	  * 这里抽象方法没有构建
	 */
	public abstract void setNumber(String n);
	public abstract String giveN();
	public abstract String giveCorpName();
}

//final类 不能被继承（即不能有子类）
final class Mobile extends Si{
	String number;
	
	//final方法 不能被子类重写，只能继承
	public final void setNumber(String n) {
		number = n;
	}
	@Override
	public final String giveN() {
		return number;
	}
	@Override
	public final String giveCorpName() {
		return "中国移动";
	}
}

//final类 不能被继承（即不能有子类）
final class Unicom extends Si{
	String number;
	
	//final方法 不能被子类重写，只能继承
	public final void setNumber(String n) {
		number = n;
	}
	@Override
	public final String giveN() {
		return number;
	}
	@Override
	public final String giveCorpName() {
		return "中国联通";
	}
}
