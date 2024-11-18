package TrainingDay3;
import java.util.Scanner;
public class TwoStudentdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner S1 = new Scanner(System.in);
System.out.println("Enter the name of the Student");
String Name1 =S1.next();
System.out.println("Enter Phone Number ");
long Phone1 = S1.nextLong();
System.out.println("Enter the House number");
int Houseno1 = S1.nextInt();
System.out.println("Enter the City");
String City1= S1.next();
System.out.println("Enter the State");
char State1= S1.next().charAt(0); //How to print two character for State Name
System.out.println("Enter the Zip Code");
long Zip1= S1.nextLong();
System.out.println("------------------------------------");
System.out.println("Student Name:" + Name1);
System.out.println("Phone Number:" + Phone1);
System.out.println("Address:" + Houseno1 +"\n"+ City1+ State1 + Zip1);
	
	
		Scanner S2 = new Scanner(System.in);
	
	System.out.println("Enter the name of the Student");
	String Name2 =S2.next();
	System.out.println("Enter Phone Number ");
	long Phone2 = S2.nextLong();
	System.out.println("Enter the House number");
	int Houseno2 = S2.nextInt();
	System.out.println("Enter the City");
	String City2= S2.next();
	System.out.println("Enter the State");
	char State2= S2.next().charAt(0);
	System.out.println("Enter the Zip Code");
	long Zip2= S2.nextLong();
	System.out.println("------------------------------------");
	System.out.println("Student Name:" + Name2);
	System.out.println("Phone Number:" + Phone2);
	System.out.println("Address:" + Houseno2 +"\n "+ City2 + State2 +Zip2);
	}
		
}
