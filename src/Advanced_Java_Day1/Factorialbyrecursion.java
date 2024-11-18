package Advanced_Java_Day1;
import java.util.Scanner;
public class Factorialbyrecursion {

	static int fact=1;
public static int factorial(int n) {
	
	if(n==1) {
		return 1;
	}
	else {
	return n*factorial(n-1);
	
}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter the number");
int n = s.nextInt();
System.out.println("The factorial of " + n + " is = " + factorial(n));
/*calcfact(n);
System.out.println("The Factorail of " + n + " is = " + fact);
s.close();

	}
static void calcfact(int n) {
	if (n>=1) {
		fact=fact*(n);
		calcfact(n-1);
	}
	*/
	
}

}
