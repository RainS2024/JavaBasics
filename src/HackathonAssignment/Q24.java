package HackathonAssignment;
import java.util.Scanner;
/*Q23: Write a program which inputs a positive natural number N 
 * and prints the possible consecutive number combinations, 
 * which when added give N.    	
 * INPUT:  N = 9  	
 * OUTPUT:  
 * 4 + 5  		      
 * 2 + 3+ 4*/

public class Q24 {

	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter the number");
int N = s.nextInt();
consecutive(N);
	}

private static void consecutive(int N) {
		for(int i=1;i<=N/2;i++) {
			int sum = 0;
			int x=i;
			String s= "";
			while (sum<N) {
				sum = sum +x;
				s= s + x + "+";
				x++;
			if (sum==N) {
				System.out.println(s);
			}
		}
		}
}
}
