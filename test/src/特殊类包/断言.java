package 特殊类包;
//5.14
public class 断言 {
//调试的时候有用
	
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
