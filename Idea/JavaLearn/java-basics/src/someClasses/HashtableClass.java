package someClasses;

import java.util.Hashtable;
//哈希表
public class HashtableClass {
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
