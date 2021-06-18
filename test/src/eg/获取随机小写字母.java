package eg;
//6.18
public class 获取随机小写字母 {
	public static void main(String[] args) {
		long t = System.currentTimeMillis();		//获取一串数
		int r = (int)(t%26);						//转化成 [0,25] 之间的数
		char ch = (char)('a'+r);
		
		System.out.println(r+" "+ch);

	}
}
