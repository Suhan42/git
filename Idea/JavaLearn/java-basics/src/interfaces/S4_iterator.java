package interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class S4_iterator {
    public static void main(String []args) {

        char word = 64; // ASCII of A
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
