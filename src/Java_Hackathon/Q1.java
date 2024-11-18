package Java_Hackathon;
import java.util.Scanner;
public class Q1 {
/*  Q1) Consider there is a 3 Boolean variable called a, b, c. 
Check if at least two out of three Booleans are true*/    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first boolean value");
		boolean a = s.nextBoolean();
		System.out.println("Enter the second boolean value");
		boolean b = s.nextBoolean();
		System.out.println("Enter the third boolean value");
		boolean c = s.nextBoolean();
		
		int cnt = 0;
		if (a==true)
			cnt++;
		if(b==true)
			cnt++;
		if(c==true)
			cnt++;
		if(cnt==2)
			System.out.println("Two variables are true");
		
		else 
			System.out.println("The condition is not met");
		s.close();
}
}
