package 特殊类包;
//5.25
import java.math.BigInteger;

//处理特别大的整数
public class BigInteger类 {
	
	static int x = 2;
	
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0");
		BigInteger one = new BigInteger("1209257039");
		BigInteger two = new BigInteger("1204567890");
		BigInteger three = new BigInteger("-1209257039");
		
		sum = one.add(two);			//相加（和）
		System.out.println("和："+sum);
		
		sum = one.subtract(two);	//相减one - two（差）
		System.out.println("差："+sum);
		
		sum = one.multiply(two);	//相乘（积）
		System.out.println("积："+sum);
		
		sum = one.divide(two);		//相除（商）
		System.out.println("商："+sum);
		
		sum = one.remainder(two);	//余数
		System.out.println("余："+sum);
		
		int a = one.compareTo(two);	//返回两对象的比，1：大于。-1：小于。0：等于
		System.out.println("关系："+a);
		
		sum = three.abs();			//返回绝对值
		System.out.println("abs："+sum);
		
		sum = one.pow(x);			//返回 one 的 2 次方
		System.out.println(x+"次方："+sum);
		
		String str = one.toString();
		System.out.println(str);
		
		str = one.toString(x);		//返回当前数的 2 进制字符串
		System.out.println(str);
	}
}
