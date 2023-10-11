package someClasses;
import java.io.UnsupportedEncodingException;

public class StringClass {

    //只读不写
    //不可写，会提高读的速度，节省内存
    public static void main(String[] args) {
        //t1,t2是 new 出来的，所以是两个变类
        String t1 = new String("one");//t1是引用变量，存地址
        String t2 = new String("one");
        System.out.println(t1==t2);
        //compareTo方法按照字典序与参数指定的String对象进行对比（这里是t1-t2）
        int r1 = t1.compareTo(t2);		//t1-t2
        //equals是String的一个方法，也是判等比较
        boolean r2 = t1.equals(t2);
        System.out.println("t1-t2="+r1+"\nequals is:"+r2);

        //ss,tt虽然是不同行创建的类，但是内容一样，（经优化后）所以是一个类（指向同一个类地址）
        String ss ="two";
        String tt ="two";
        //只有String是判等的
        System.out.println(ss==tt);

        //因为这里是 new 出来的，所以是不同一个类
        Object o1 = new Object();
        Object o2 = new Object();
        boolean r3 = o1.equals(o2);		//这里的 equals 和直接判等 == 同一效果，是比较地址
        System.out.println(r3);
        //length是String的一个方法，返回串的长度
        System.out.println(ss.length());
        System.out.println();
//---------------------------------------------------------

        //拼串
        String s1 = "你";
        String s2 = "好";
        String s12;
        s12 = s1+s2;
        System.out.println(s12);

        String str = "asd";
        str += "lmn";
        System.out.println(str);
        System.out.println();
//---------------------------------------------------------

        //方法
        String str1 = "you are good javahhh  ";
        String str2 = "what are you from";
        //startsWith方法判断当前String对象前面是不是指定的（这里是you）
        System.out.println("str1: "+str1.startsWith("you"));
        System.out.println("str2: "+str2.startsWith("you"));
        //同理endsWith方法判断当前String对象最后面是不是指定的（这里是a）
        System.out.println(str1.endsWith("a"));

        //contains方法判断当前String对象是否包含某一参数（这里是good）
        System.out.println("str1包含的?"+str1.contains("good"));

        //indexOf方法返回指定字符（这里是good）在String对象中的第一次出现处的索引，如果此字符串中没有这样的字符，则返回-1
        System.out.println(str1.indexOf("good"));
        System.out.println(str1.indexOf("sd"));

        //substring方法复制原String对象中的(开始复制的下标，结束的下标)
        String str11 = str1.substring(1,5);
        System.out.println(str11);

        //trim方法复制原String对象的内容，但是去掉该对象末尾的空格
        String str1_trim = str1.trim();
        System.out.println(str1);
        System.out.println(str1_trim);

        //分割
        System.out.println("分割");
        String[] sp = str1.split(",");//分割并且放入数组中
        for(int i=0; i<sp.length; i++){
            System.out.println(sp[i]);
        }


        System.out.println();
//-------------------------------------------------------------------------

        //字符串转化
        int x;
        double d;
        byte b;
        long l;
        float f;
        String str0 = "123";
        x = Integer.parseInt(str0);
        d = Double.parseDouble(str0);
        b = Byte.parseByte(str0);
        l = Long.parseLong(str0);
        f = Float.parseFloat(str0);
        System.out.println(x+" "+d+" "+b+" "+l+" "+f);


        char []c = new char[3];
        String strc = "nihao";
        //getChars方法，这里从strc的下标为1到3(是到<4)，复制到数组c中，从char[0]开始
        strc.getChars(1, 4, c, 0);
        System.out.println(c);

        //toCharArray方法把前面的内容变为char存储
        char []cc = "hello world!".toCharArray();
        System.out.println(cc);

        //charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
        char result = strc.charAt(3);
        System.out.println(result);


        try {
            @SuppressWarnings("unused")
            byte []bb = "hello world!".getBytes("UTF-8");		//getBytes把前面转换成字节，使用utf-8(详细见../输入_输出流/字节流.java)
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }






        double sum=0, item=0;
        boolean computable=true;
        //命令行参数args
        for(String s:args) {
            try{
                item = Double.parseDouble(s);
                sum = sum+item;
            }
            catch(NumberFormatException e) {
                System.out.println("您输入了非法字符："+e);
                computable = false;
            }
        }
        if(computable)
            System.out.println("sum:"+sum);

    }
}

