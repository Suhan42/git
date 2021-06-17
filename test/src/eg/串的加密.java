package eg;
//5.21
import java.util.Scanner;

public class 串的加密 {
	//passwd是密钥
	static String encrypt(String sourceString, String passwd) {
		char []p = passwd.toCharArray();				//toCharArray() 把串转化成字符数组
		int n = p.length;
		char []s = sourceString.toCharArray();
		int m = s.length;
		
		for(int i=0; i<m; i++) {
			int demo = s[i]+p[i%n];					//i%n 当i==n时又变成0，形成环
			s[i] = (char)demo;
		}
		return new String(s);
	}
	
	static String decrypt(String sourceString, String passwd) {
		char []p = passwd.toCharArray();
		int n = p.length;
		char []s = sourceString.toCharArray();
		int m = s.length;
		
		for(int i=0; i<m; i++) {
			int demo = s[i]-p[i%n];
			s[i] = (char)demo;
		}
		return new String(s);
	}
	
	public static void main(String[] args) {
		String sourceString = "解密失败（笑）";
		System.out.println("内容："+sourceString);
		
		Scanner scanner = new Scanner(System.in);
		String passwd = scanner.nextLine();
		scanner.close();
		
		String secret = encrypt(sourceString, passwd);
		System.out.println("密文："+secret);
		
		String source = decrypt(secret, passwd);
		System.out.println("明文："+source);
		
				

	}
}