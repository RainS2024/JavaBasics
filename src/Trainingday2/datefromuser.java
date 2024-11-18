package Trainingday2;
import java.util.Scanner;
public class datefromuser {

	public static void main(String[] args) {
		Scanner S= new Scanner (System.in);
		System.out.println("Enter your name");
		String name= S.next();
		System.out.println("Enter your Age");
		int Age=S.nextInt();
		System.out.println("Enter your Gender");
		char gender = S.next().charAt(0);
		System.out.println("Enter your date of birth");
		long DOB= S.nextLong();
		System.out.println("-----------------");
		System.out.println("Name:" + name);
		System.out.println("Age :" + Age);
		System.out.println("Gender:" + gender);
		System.out.println("Dateof birth:" + DOB);//couldn't take 0 as first number in 01071981
		
		
		// TODO Auto-generated method stub

	}

}
