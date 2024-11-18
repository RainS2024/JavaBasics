package Assignment;
import java.util.Scanner;
public class sumofintegars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first Integar");
		int x = s.nextInt();
		System.out.println("Enter the second Integar");
		int y = s.nextInt();
		System.out.println ("Enter the third integar");
		int z= s.nextInt();
		int sum = x + y + z ;
		System.out.println("----------------------------");
		System.out.println("The sum of three integars = "+ sum);
	}

}
