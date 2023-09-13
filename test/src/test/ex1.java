package test;

//import java.util.Scanner;
import java.util.*;//把这个包里面的全部拿出来，但是它只导入这一层里面的包，如果还有子包就不导入了

public class ex1 {
	public static void main(String args[]){
		System.out.println("scanf:");
		
		Scanner reader=new Scanner(System.in);
		
		//Data da=new Data();
		
		//也可以使用 数据类型，比如类型int->Integer(类)
		Integer sum=42;
		System.out.println("输入一个数字：");
		int x=reader.nextInt();
		
		String s1, s2;
		System.out.println("输入两个串（使用空格隔开）：");
		s1=reader.next();
		s2=reader.nextLine();
		
		reader.close();	//输入完再close关闭，不然会警告
		
		System.out.println(x+" suhan "+sum);
		System.out.println(s1+" and "+s2);
		
		boolean bool = s1 instanceof String;//instanceof 运算符判断前面的对象属不属于后面的类(后面的类也可以是父类),属于的话返回true,否则false
		boolean bool2 = sum instanceof Object;
		System.out.println(bool+" "+bool2);
	}
}