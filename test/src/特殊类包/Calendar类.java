package 特殊类包;
//5.25

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 日期类，淘汰了Date
 * 这个类是一个抽象类
 * 所以不能 new
*/
public class Calendar类 {
	public static void main(String[] args) {
		//下面这两个初始化对象一样
		Calendar ca1 = Calendar.getInstance();
		@SuppressWarnings("unused")
		Calendar ca2 = new GregorianCalendar();
		
		int year = ca1.get(Calendar.YEAR);
		int month = ca1.get(Calendar.MONDAY)+1;	//0是一月递增到11表示十二月
		int day = ca1.get(Calendar.DATE);		//这个DATE其实和DAY_OF_MONTH一个效果，同样作用
		@SuppressWarnings("unused")
		int day2 = ca1.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = ca1.get(Calendar.DAY_OF_WEEK)-1;	//1表示周日，7表示周六
		int dayOfYear = ca1.get(Calendar.DAY_OF_YEAR);
		int weekOfMonth = ca1.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear = ca1.get(Calendar.WEEK_OF_YEAR);
		@SuppressWarnings("unused")
		int hour = ca1.get(Calendar.HOUR);			//12小时制
		int hour2 = ca1.get(Calendar.HOUR_OF_DAY);	//24小时制
		
		int minute = ca1.get(Calendar.MINUTE);
		int sec = ca1.get(Calendar.SECOND);
		
		System.out.println(year+"年"+0+month+"月"+day+"日，是星期"+dayOfWeek);
		System.out.println("现在是"+hour2+":"+minute+":"+sec);
		System.out.println("今天是今年的第"+dayOfYear+"天，\n这周是这个月的第"+weekOfMonth+"周，是今年的第"+weekOfYear+"周");
	}
}
