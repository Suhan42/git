package 特殊类包;
//7.7
import java.util.Hashtable;

public class Hashtable哈希表 {
	public static void main(String[] args) {
		
		Hashtable<String, String> h = new Hashtable<String, String>();
		h.put("100", "aaa");
		h.put("200", "bbb");
		h.put("300", "ccc");
		
				
		System.out.println(h.get("300").toString()
				+h.get("200").toString()
				+h.get("100").toString());
			
		h.clear();
	}
}

