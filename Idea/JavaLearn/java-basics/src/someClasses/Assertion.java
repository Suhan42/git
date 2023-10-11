package someClasses;

/*
断言(assertion)是一种在程序中的一阶逻辑(如：一个结果为真或假的逻辑判断式)，
目的为了表示与验证软件开发者预期的结果——当程序执行到断言的位置时，对应的断言应该为真。若断言不为真时，程序会中止执行，并给出错误信息。

调试的时候有用
*/
public class Assertion {
    public static void main(String[] args) {
        int [] score= {12, 200, 12, -12};
        int sum=0;
        for(int number:score) {
            //断言，在运行时不可用
            //Run Configurations/Arguments/VM arguments: -ea启动调试
            assert number > 0:"不能是负数";		//断言
            sum = sum+number;
        }
        System.out.println(sum);
    }
}
