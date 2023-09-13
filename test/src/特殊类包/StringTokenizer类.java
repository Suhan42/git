package 特殊类包;
//5.21
import java.util.StringTokenizer;

//StringTokenizer类将字符串进行分隔
public class StringTokenizer类 {
	public static void main(String[] args) {
		String str = "google,baidu,facebook,zhihu,suhan";
		StringTokenizer st = new StringTokenizer(str, ",");		//这里是把str放进去之后指定 , 为分隔标记（这里的str也可以直接是串）
		
		while(st.hasMoreTokens()) { 	 //hasMoreTokens()返回是否还有分隔符
            System.out.println(st.nextToken());			//nextToken()返回从当前位置到下一个分隔符的字符串
        }
		
		StringTokenizer st2 = new StringTokenizer("you,are good#programmer:engineer", " ");
		System.out.println(st2.nextToken("#"));		//nextToken(String delim)到指定的分隔符返回结果
	}
}