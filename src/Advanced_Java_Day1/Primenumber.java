package Advanced_Java_Day1;

//Write a program to check whether the 
//given number is prime number or not. 
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner S = new Scanner (System.in);
System.out.println("Enter the number");
int n = S.nextInt();
int temp=0;
for (int i=2;i<=n-1;i++) {
	     if  (n%i==0) {
	    	 temp=temp+1;
	     }
}
	    if(temp>0) {
	    	 System.out.println("The number is not prime");
	     }
	    else {
	    	System.out.println("The number is prime");
}
	    S.close();
	}

}
