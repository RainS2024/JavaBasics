package Advanced_Java_Day1;
import java.util.Scanner;
public class Function_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the first number");
		int a=s.nextInt();
		System.out.println("Enter the Second Number");
		int b = s.nextInt();
		int Maxofnum = Maxnum( a, b);
		System.out.println("Maximum of two numbers is: " + Maxofnum);
		System.out.println("Enter the Third Number");
		int c = s.nextInt();
		int Maxofnum2 = Maxnum(a,b,c);
		System.out.println("Maximum of three numbers is: " + Maxofnum2);	
		s.close();
	}
public static int Maxnum(int a,int b) {
	if (a>b)
		return a;
	else
		return b;
}
public static int Maxnum(int a,int b,int c) {
	if (a>b && a>c)
		return a;
	if (b>a && b>c)
		return b;
	else
		return c;
}
}
