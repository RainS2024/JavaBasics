package Advanced_Java_Day1;

import java.util.Scanner;

public class Factorial {
// by iterative technique
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to find Factorial of");
		int n = s.nextInt();
		int fact = 1;
		for (int i=1 ; i<=n;i++) {
			fact=fact*i;
			
		}
		
		System.out.println("The Factorial is :" + fact );
		s.close();
		
		// another method
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number to find Factorial of");
		int n1 = s1.nextInt();
		int fact1 = 1;
		for (int i=n1 ; i>=1;i--) {
			fact1=fact1*i;
			
		}
		System.out.println("The Factorial is :" + fact1 );
		s1.close();
	}

}
