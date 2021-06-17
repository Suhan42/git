package 特殊类包;
//5.21
import java.util.Scanner;

public class Scanner类 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		boolean bool;
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		String str, ss;
		
		bool = reader.nextBoolean();
		b = reader.nextByte();
		s = reader.nextShort();
		i = reader.nextInt();
		l = reader.nextLong();
		f = reader.nextFloat();
		d = reader.nextDouble();
		str = reader.next();		//next在输入中，tab、空格、回车都可以结束。但是，在next中回车之后，nextLine就不能输入东西了
		ss = reader.nextLine();		//nextLine在输入中，只有回车可以结束
		
		reader.close();				//关闭，不然会警告
		
		
		System.out.print("bool:"+bool+"    byte:"+b);		//print输出不会换行
		System.out.println("    short:"+s+"    int:"+i);		//println输出会自动换行
		System.out.println("long:"+l+"    float:"+f+"    string:"+str);
		
		System.out.printf("%d    %s\n", i, ss);		//\n换行
		System.out.printf("%5d\n", i);			//输出int型数据，占5行
		System.out.printf("%5.4f", d);			//输出浮点型数据，占5行，小数点保留4位
	}
}
