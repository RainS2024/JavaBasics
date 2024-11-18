package Java_Hackathon;

import java.util.Scanner;

//Q2 write a program to find factorial (Non Recursive)
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to find Factorial of");
		int n = s.nextInt();
		int fact = 1;
		for (int i=1 ;i<=n;i++) {
			fact=fact*i;
			
		}
		
		System.out.println("The Factorial is :" + fact );
		s.close();
		
	}

}
