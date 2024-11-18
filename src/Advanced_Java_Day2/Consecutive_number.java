package Advanced_Java_Day2;
import java.util.Scanner;
/* Write a program which inputs a positive natural number N 
 and prints the possible consecutive number combinations, which when added give N.   
input:9 */

public class Consecutive_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner (System.in);
System.out.println("Enter a positive natural number N ");
int N = s.nextInt();
consecutive(N);
s.close();
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

