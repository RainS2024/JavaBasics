package Advanced_Java_Day1;

import java.util.Scanner;

public class Practice_Day1 {

public static void reverseString() {
	Scanner s = new Scanner (System.in);
	System.out.println("Enter the String you want to reverse");
	String Word=s.nextLine();
	StringBuilder Word1= new StringBuilder(Word);
	StringBuilder newWord =Word1.reverse();
	System.out.println("The reversed String is :" + newWord);
	//s.close();
}
	
public static void reverseNumber() {
	Scanner s = new Scanner (System.in);
	System.out.println("Enter the Number you want to reverse");
	int Num=s.nextInt();
	String Num1 = Integer.toString(Num);
	StringBuilder Num2 = new StringBuilder(Num1);
	StringBuilder newNum =Num2.reverse();
	System.out.println("The reversed String is :" + newNum);
	//s.close();
}	
	
public static void reverseFunctions() {
	Scanner s = new Scanner (System.in);
	String Answer= "";
	char ans;
	do {
	System.out.println("You want to reverse a String or a Number?");
	System.out.println("Enter String/Number/Quit to exit");
	Answer = s.next();// Read the user's answer
	s.nextLine();// Consume the newline left after next()
	ans = Answer.charAt(0);
	if(ans=='S'|| ans=='s') {	
		reverseString();}
	else if (ans=='N'|| ans=='n') {
		reverseNumber();	
	}
	else if (ans=='Q'|| ans=='q') {
		System.out.println("Exiting the proqramme");
		break;
	}
	else {
		System.out.println("Invalid entry please try again");
	}
	}
	while(ans!='Q'&& ans!='q');
	s.close();

		}

public static void swapFunction() {
	Scanner s = new Scanner(System.in);
	char Answer;
	do {
	System.out.println("Do you want to Swap Two Numbers?");
	System.out.println("Enter Y for Yes or Q to exit");
	Answer = s.next().charAt(0);
	if (Answer=='Y'|| Answer=='y') {	
	System.out.println("Enter the first number x ");
	int x = s.nextInt();
	System.out.println("Enter the second number y ");
	int y = s.nextInt();
	int z= x+y;
	x= z-x;
	y = z-y;
	System.out.println("The value of x after swapping is =" + x);
	System.out.println("The value of y after swapping is =" + y);
	}
	else if ((Answer=='Q'|| Answer=='q')){
		System.out.println("Exiting the programme");
	}
	else {
		System.out.println("Invalid entry please try again");
	}
	}
	while (Answer!='Q' && Answer!='q');
	s.close();

}

public static void countingBoolean() {
	Scanner s = new Scanner(System.in);
	char ans;
	do {
		System.out.println("Do you want to count the boolean values");
		System.out.println("Enter Y for Yes or E to Exit");
		ans=s.next().charAt(0);
		if(ans=='Y'|| ans=='y') {
	System.out.println("Enter the first boolean value");
	boolean bool1 = s.nextBoolean();
	System.out.println("Enter the second boolean value");
	boolean bool2 = s.nextBoolean();
	System.out.println("Enter the third boolean value");
	boolean bool3 = s.nextBoolean();
	int cnt=0;
	if(bool1==true) 
		cnt++;
	if (bool2==true) 
		cnt++;
	if (bool3==true) 
		cnt++;
	if(cnt==2) {
		System.out.println("There are two true boolean values entered");
	}
	else {
		System.out.println("Try again . True is not entered two times");
	}
	}
		else if (ans=='E'|| ans=='e') {
			System.out.println("Exiting from Programme");
		}
		
	}
	
	while(ans!='E'&& ans!='e');
	s.close();
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
}
}

