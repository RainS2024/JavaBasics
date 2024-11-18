package TrainingDay3;
import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner S = new Scanner(System.in);

System.out.println("Enter the Length");
int Length = S.nextInt();
System.out.println("Enter the pi value");
float pi= S.nextFloat();
System.out.println("Enter the value of Area");
double Area = S.nextDouble();
System.out.println("Enter the Fact");
boolean Fact = S.nextBoolean();
System.out.println("----------------------------");
System.out.println("The Length is = " + Length);
System.out.println("The value of Pi is= " + pi);
System.out.println("The value of Area is = " + Area);
System.out.println("The Fact is = " + Fact);



	}

}
