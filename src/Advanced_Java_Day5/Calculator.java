package Advanced_Java_Day5;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter two numbers ");
float num1= s.nextInt();
float num2=s.nextInt();
System.out.println("Choose the operator for the operation + , - , * , / "); 
char operator= s.next().charAt(0);
s.close();
switch(operator) {
 case('+'):
	 System.out.println("The sum of two numbers " + num1 + " & " + num2 + " is " + (num1+num2));
 break;
 case('-'):
 System.out.println("The substraction of two numbers " + num1 + " & " + num2 + "is" + (num1-num2));
 break;
 case('*'):
	 System.out.println("The multiplication of two numbers " + num1 + " & " + num2 + " is " + (num1*num2));
 break;
 case('/'):
	 if(num2!=0) {
	 System.out.println("The division of two numbers " + num1 + " & " + num2 + " is " + (num1/num2));}
	 else {
		 System.out.println("The operation will throw a zero error");	 
	 }
 break;	 
 default:
	 System.out.println("The operation is invalid");
}

	}

}
