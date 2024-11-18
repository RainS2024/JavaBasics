package TrainingDay3;
import java.util.Scanner;

// Exercise Problem 5

public class Average {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner S= new Scanner (System.in);
System.out.println("Enter The First Number");
int N1= S.nextInt();
System.out.println("Enter the Second Number");
int N2= S.nextInt();
System.out.println("Enter the Third Number");
int N3= S.nextInt();
double Average = (N1+N2+N3)/3;
System.out.println("-----------------------------------------");
System.out.println("The Average of Three Numbers:" + Average);
	}

}
