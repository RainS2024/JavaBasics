package Java_Hackathon;
import java.util.Scanner;
//Q13 Given a string print the reverse of the string.(Input:  Java Code Output: edoC avaJ)

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the String you would like to reverse");
		String sent = s.nextLine();
		StringBuilder sb= new StringBuilder(sent);
		StringBuilder newsent = sb.reverse();
		System.out.println(newsent);
	}

}
