package Java_Hackathon;
import java.util.Scanner;
//Q23. WJP to differentiate input as string, int or boolean
//i do not know
public class Q23 {

 static boolean isNumber(String x) {
		
		for (int i=0;i<x.length();i++) {
			if (Character.isDigit(x.charAt(i))== false)
			return false;
		
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		System.out.println("Enter your input");
		String S1= s.next();
		
		if(isNumber(S1)) {
			System.out.println("The object is Integer");
		}
		else {
			System.out.println("The object is String");
		}
		
	}

}
