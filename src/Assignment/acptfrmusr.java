package Assignment;
import java.util.Scanner;
public class acptfrmusr {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter Name :");
String name = s.next();
System.out.println("Enter Age:");
int Age= s.nextInt();
System.out.println("Enter Gender:");
char gender = s.next().charAt(0);
System.out.println("Enter Aadhar Number:");
long number = s.nextLong();  //does not print the 0 value at first 2 places
System.out.println("-----------------------------");
System.out.println("Name:" + name);
System.out.println("Age:" + Age);
System.out.println("Gender:" + gender);
System.out.println("Aadhar Number:" + number);
	}

}
