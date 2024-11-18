package Assignment;
import java.util.Scanner;
public class print2numbermath {
//Math problems using user input
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter the first number");
int n1=s.nextInt();
System.out.println("Enter the Second number");
int n2 = s.nextInt();
int sum = n1 + n2;
int Multiply = n1*n2;
int Substract = n1-n2;
int division = n1/n2;
int remainder= n1%n2;
System.out.println("--------------------");
System.out.println("Sum of the numbers=" + sum);
System.out.println("Multiplication of the numbers="+ Multiply );
System.out.println("Substraction of the numbers=" + Substract);
System.out.println("Division of the numbers="+ division);
System.out.println("Modulus of the numbers="+ remainder);

	}

}
