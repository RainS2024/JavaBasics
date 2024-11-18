package Assignment;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter number 0 or 1 ");
int n = s.nextInt();
if (n==0) {
System.out.println("Thanks You for exiting");
}
else if(n==1) {
	System.out.println("Enter the Marks scored ");
	int Marks = s.nextInt();
	if (Marks >=90) {
		System.out.println("This is Good");
	}
	else if(Marks >=60 && Marks<=89){
		System.out.println("This is also Good");
	}
	else if (Marks >=0 && Marks<=59) {
		System.out.println("This is Good as well");
	}
	else {
		System.out.println("You tried your best");
	}
}
else {
	System.out.println("Invalid Input");
}

	}
}

	


