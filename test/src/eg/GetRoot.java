package eg;
//6.11

import java.util.Scanner;

public class GetRoot {
	
/*求二元一次方程的解
 *△=b*b-4*a*c
 */
	public static void main(String[] args) {
		double x1, x2, a, b, c, d;
		Scanner in = new Scanner(System.in);
		
		System.out.println("请依次输入a, b, c");
		a=in.nextDouble();
		b=in.nextDouble();
		c=in.nextDouble();
		in.close();
		
		d=b*b-4*a*c;
		
		if(d>0) {
			x1=(-b + Math.sqrt(d))/2*a;
			x2=(-b - Math.sqrt(d))/2*a;
			System.out.println("方程有两个root，分别是"+x1+"和"+x2);
		}
		if(d==0) {
			x1=(-b - Math.sqrt(d))/2*a;
			System.out.println("方程有一个root，x="+x1);
		}
		else {
			double aa, bb;
			aa = -b/2*a;
			bb = Math.sqrt(-d)/2*a;
			System.out.println("方程没有实根，但是有虚根，分别是："+aa+"+"+bb+"i  和  "+aa+"-"+bb+"i");
		}

	}
}

		