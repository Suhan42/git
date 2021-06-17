package 接口包;
//4.30
import java.util.Arrays;

public class Comparable接口作比较 {
	public static void main(String []args) {
		
//Comparable 是接口名字
		Comparable<String> s1 = "hello";
		String s2 = "zzzzz";
		String s3 = "helloo";
		
//compareTo()函数用于做比对
		int result = s1.compareTo(s2);		//s1-s2
		int result2 = s1.compareTo(s3);
		
		System.out.println(result);
		System.out.println(result2);
		

		String[] sun = {"mjn", "kmf", "lkg", "idnfd", "dsnhf"};
		
//排序(前提是有自然顺序)
		Arrays.sort(sun);
		
		
		//输出
		for(String s:sun) {
			System.out.println(s);
		}
		
	}
}
