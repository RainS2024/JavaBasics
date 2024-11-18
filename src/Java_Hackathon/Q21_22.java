package Java_Hackathon;

import java.util.Scanner;


public class Q21_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Q21. WJP to convert string to int
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to convert into int");
		String n = s.next();
		int no= Integer.parseInt(n);//converts to int

		System.out.println("String to int: " + no);
	

		//Q22. WJP to convert int to string

		System.out.println("Enter the number to convert into String");
		int x = s.nextInt();
		String X1=String.valueOf(x);
		String X= Integer.toString(x);//not possible to do Math functions with string value it throws error
		System.out.println("int value of x to String = " + X);
					

		
	}

}
