package basics;

//import java.lang.reflect.Array;

/* 初始值 排序值 判断相等

 * 命令行参数 传递参数到 args
 * 在run里面的confi...
 */
public class S2_initial {
    public static void main(String []args) {
        // 1.初始值
        System.out.println(args.length);

        for(String s:args) {//for(int i=0; i!=args.length; i++) {
            System.out.println(s);//System.out.println(args[i]);
        }

        // 2.判断相等
        int a[]= {1, 2, 3};
        int b[]= {4, 5, 6};
        int c[]= {1, 2, 3};
        System.out.println(a==b);//判断是否相等，返回true or false
        System.out.println(a==c);//判断地址
        System.out.println(c[1]==a[1]);//判断元素


        // 3.值的问题
        int[] grades=new int[20];
        for(int i=0; i!=grades.length; i++) {
            grades[i]=(int)(Math.random()*41)+60;//随机数(1-100之间)
        }
        for(int grade:grades) {
            System.out.print(grade+" ");
        }
        System.out.println();
        int max=grades[0];
        for(int i=0; i!=grades.length; i++){
            if(max<grades[i])
                max=grades[i];
        }
        //find max
        System.out.println("max is:"+max);
    }
}
