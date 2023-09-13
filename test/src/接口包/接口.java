package 接口包;
//4.27
/*接口可以随意跨包
  * 接口，类似于继承
 */
import p1.p2.p3.Interface例子;

//用 , 实现多个接口
public class 接口{
	
	public static void main(String []args) {
		Interface例子 ex = new InterfaceClass();
		double s = ( (InterfaceClass)ex).area();	//强制类型转换 类
		System.out.println("圆形的面积"+s);
	}
}



//这里是一个类来实现接口，也可以用多个类来实现接口多态
class InterfaceClass implements Interface例子,Iarea{
	@Override
	public double area() {
		return pi*r*r;
	}
}
