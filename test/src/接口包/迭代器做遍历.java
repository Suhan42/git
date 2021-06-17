package 接口包;
//4.30
import java.util.ArrayList;
import java.util.Iterator;

public class 迭代器做遍历 {
	public static void main(String []args) {
		
		char word = 64;
		ArrayList<String> al = new ArrayList<>();
		for(int i=0; i<5; i++) {
			word++;
			al.add(word+" ");
		}
		
		//返回迭代器
		Iterator<String> it = al.iterator();
		
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
	}
}
