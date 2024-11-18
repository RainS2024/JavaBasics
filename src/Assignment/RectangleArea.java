package Assignment;
import java.util.Scanner;
public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Length:");
		int length = s.nextInt();
		System.out.println("Enter the Width:");
			int width = s.nextInt();
		System.out.println("------------------------------");
		int Area = length*width;
		int Perimeter = 2*(length+width);
		System.out.println("Area of Rectangle = " + Area);
		System.out.println ("Perimeter of Rectangle=" + Perimeter);
		


	}

}
