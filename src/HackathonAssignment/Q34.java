package HackathonAssignment;

import java.util.Scanner;

//Q34. Write a method to implement *, - , / operations. You should use only the + operator
public class Q34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("enter a value:");

		int a = reader.nextInt();

		System.out.println("enter b value:");

		int b = reader.nextInt();



		System.out.println("Addition is: " +add(a,b));

		System.out.println("Substraction is: " +sub(a,b));

		System.out.println("Multiplication is: " +multiply(a,b));

		System.out.println("Division is: " +div(a,b));

		}



		public static int add (int a, int b) {

		return a+b;

		}



		public static int sub(int a,int b) {

		return a +(-b);

		}





		public static int multiply(int a, int b) {

		int mul=0;

		if (b==0) {

		return 0;

		}else

		{

		for(int i=1;i<=a;i++) {

		//calculates the sum

		mul=mul+b;

		}

		return mul;

		}

		}



		public static float div(int a, int b) {

		if(b==0) {

		throw new IllegalArgumentException("Division by zero");

		}

		else if(b==1) {

		return a;

		}

		else {

		int c=0;

		while (a>=b)

		{

		a=a-b;

		c++;

		}

		return c;

		}



		}



		
	
		
	}


