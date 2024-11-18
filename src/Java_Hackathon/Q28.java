package Java_Hackathon;
//Q28. WJP to find factorial of a number using recursion
import java.util.Scanner;

public class Q28 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		Q28 F = new Q28();
		F.calcfact(n);
		System.out.println("The Factorial of " + n + " is = " + calcfact(n));


			}
	static int calcfact(int n){
		if (n==0) 
		return 1;
		else
			return (n * calcfact(n-1));
}
		}
		

		
		
	


