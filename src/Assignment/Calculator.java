package Assignment;

import java.util.Scanner;

public class Calculator {

	public static double Calculator(int a, int b, String Option) {
		double result=0;
		switch(Option) {
		case "1":
			result = a+b;
			break;
		case "2":
			result = a-b;
			break;
		case "3":
			result = a*b;
			break;
		case "4":
			result = a/b;
			break;
		case "5":
			result= a%b;
			break;
		default:
			System.out.print("Invalid Input");	
		}
		System.out.println(result);	
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		System.out.println("Enter the option\n1 : To add\n2 : To substract\n3 : To Multiply\n4 : To Divide\n5 : For Modulo\nQ: To Quit");
		String Option = s.next();
		while(!Option.equals("Q")){
		System.out.println("Enter the option\n1 : To add\n2 : To substract\n3 : To Multiply\n4 : To Divide\n5 : For Modulo\nQ: To Quit");
		Option = s.next();	
		Calculator(a, b, Option);	
		
	}

}}
