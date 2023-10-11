package eg;
import java.util.Scanner;

//random产生随机 [0,1)之间的数
public class Random_out {
    //输出n-m之间的随机数
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入开头结尾（数字）：");
        int n, m;
        n = in.nextInt();
        m = in.nextInt();
        in.close();

        if(n>m) {
            System.err.println("m>n");	//报错
            System.exit(0); 		//0是正常输出，不是0就是非正常输出
        }
        int r;

        //获取随机
        System.out.println("在[n,m):");
        for(int i=0; i<10; i++) {
            r = (int)(Math.random()*(m-n) )+n;
            System.out.print(r+" ");
        }
        System.out.println();


        System.out.println("在[n,m]:");
        for(int i=0; i<10; i++) {
            r = (int)(Math.random()*(m-n+1) )+n;
            System.out.print(r+" ");
        }
    }
}

