package Advanced_Java_Day1;
import java.util.Scanner;
//Swap two numbers with and without third variable
public class Swapfunction {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the first number");
		int a=s.nextInt();
		System.out.println("Enter the Second Number");
		int b = s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = "+a);
		System.out.print("b = " +b);
		System.out.println();
		s.close();

	//using 3rd variable
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter the first number");
		int a1=s1.nextInt();
		System.out.println("Enter the Second Number");
		int b1 = s1.nextInt();	
		int temp=a1;
		a1=b1;
		b1=temp;
		System.out.println("a1 = " + a1);
		System.out.print("b1 = " +b1);
		s1.close();		
		
		
	}

	
}
