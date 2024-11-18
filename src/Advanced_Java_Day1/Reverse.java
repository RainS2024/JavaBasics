package Advanced_Java_Day1;
import java.util.Scanner;
public class Reverse {
//Write a program to prompt the user "you want to reverse a digit or a string ?". 
//according to user input, your program should reverse the digits of the NUMBERS or reverse the string. 	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		System.out.println("Do you want to reverse a digit or string?");
		System.out.println("Enter D for Digit/Enter S for String");
		char Ans = s.next().charAt(0);
		switch(Ans) {
		case 'D':{
			System.out.println("Enter the digits you want to reverse");
			int number = s.nextInt();
			String Number = Integer.toString(number);
			StringBuilder Newnum = new StringBuilder(Number);
		     Newnum.reverse();
			System.out.println("The reveresed number is " + Newnum);
			s.close();
		}
		break;
		case 'S':{
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter the String you want to reverse");	
			String sentence =scan.nextLine();
			StringBuilder newsent = new StringBuilder(sentence);
			newsent.reverse();
			System.out.println(newsent);
			scan.close();
		}
		break;
		default:
			System.out.println("Invalid Entry");
		
		}
		System.out.println("Completed");
		
	}

}
