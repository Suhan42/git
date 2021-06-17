package 特殊类包;
//5.21

//因为在大多数实现中，它比 StringBuffer 要快
/*
 * StringBuffer和StringBuilder类的对象能够被多次的修改，并且不产生新的未使用对象。
 * 它和StringBuffer之间的最大不同在于：StringBuilder的方法不是线程安全的（不能同步访问）。
 * 由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。
 * 然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
 */
public class StringBuilder类 {
	public static void main(String[] args) {
		
		StringBuffer sBuffer = new StringBuffer("java student:");
		sBuffer.append("su");
		sBuffer.append("h");
		sBuffer.append("an");
		
		System.out.println(sBuffer);
	}
}