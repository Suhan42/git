package interfaces;

import java.util.Arrays;

/*
Comparable是排序接口；若一个类实现了Comparable接口，就意味着“该类支持排序”。可以使用Arrays.sort()对改类进行排序。


*/
public class S3_comparable {
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


        String[] sun = {"Google", "baidu", "suhan", "good"};

        //排序(前提是有自然顺序)
        Arrays.sort(sun);

        //输出
        for(String s:sun) {
            System.out.println(s);
        }

    }
}
