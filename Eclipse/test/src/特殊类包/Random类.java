package 特殊类包;
//5.25
import java.util.Random;

public class Random类 {
	//random产生随机[0,1)之间的数
	public static void main(String[] args) {
		//随机数
		int[] nm = new int[5];
		for(int i=0;i<nm.length; i++) {
			nm[i] = (int)(Math.random()*20)+80;	//随机在[80,100)之间
		}
		for(int r1 : nm) {
			System.out.print(r1+" ");
		}
		
		System.out.print("\n");
		
		Random r = new Random(123);	//这里123是种子，如果两个种子一样，随机结果就一样
		
		int i=0;
		while(true) {
			i++;
			int r2 = r.nextInt(100);
			System.out.print(r2+" ");
			if(i==5) break;
		}
	}
}
