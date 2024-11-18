package Assignment;
import java.util.Scanner;
//Average of 3 numbers taking user input
public class average3no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner (System.in);
System.out.println("Enter the first number");
int n1=s.nextInt();
System.out.println("Enter the second number");
int n2=s.nextInt();
System.out.println("Enter the third number");
int n3=s.nextInt();
int average = (n1+n2+n3)/3;
System.out.println("-----------------------------------------");
System.out.println("The average of three numbers is:" + average);

	}

}
