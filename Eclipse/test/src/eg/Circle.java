package eg;
//6.11
import java.util.Scanner;

/*圆的半径r=10，判断点在不在圆内
*/
public class Circle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x,y;
		double distance, r=10.0;
		System.out.println("input the two coordinates of the point:");
		
		x=input.nextDouble();
		y=input.nextDouble();
		
		input.close();
		
		distance = Math.sqrt(Math.pow(x,2)+y*y);
		
		if(distance<=r) {
			System.out.println("point ("+x+","+y+") is in circle");
		}
		else {
			System.out.println("point ("+x+","+y+") is out circle");
		}

	}
}
