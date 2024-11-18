package TrainingDay3;
import java.util.Scanner;
public class areausrinput {
//Area of Triangle using User Input
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner S= new Scanner (System.in);
System.out.println("Enter the Base of the Triangle;");
int Base = S.nextInt();
System.out.println("Enter the Height of the Triangle;");
int  Height = S.nextInt();
int Area = (Base * Height)/2;


System.out.println("------------------------------------");
System.out.println ("The Area of the Traingle is :" + Area);

	}

}
