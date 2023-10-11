package basics;

import java.util.Scanner;
/* 判断语句and闰年天数
* */
public class S3_conditions {

    public static void main(String []args) {
        Scanner A=new Scanner(System.in);
        System.out.println("判断该年该月有几天");
        System.out.println("input year:");
        int year=A.nextInt();

        System.out.println("input month:");
        int month=A.nextInt();
        A.close();

        int days;
        days=dayIn(year, month);

        System.out.println(year+"年"+month+"月有 "+" "+days+"天");
    }

    public static int dayIn(int year, int month) {
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
//				1.四年一闰百年不闰：即如果year能够被4整除，但是不能被100整除，则year是闰年。
//				2.每四百年再一闰：如果year能够被400整除，则year是闰年。
                if(year%4==0 && year%100!=0 || year%400==0)
                    return 29;
                else
                    return 28;
            default:
                System.out.println("mistake!");
                break;  //continue
//              The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
        }
        return 0;
    }
}

