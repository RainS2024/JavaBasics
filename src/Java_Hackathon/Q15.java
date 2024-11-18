package Java_Hackathon;

import java.util.Scanner;

//Q15 Given a string print the unique words of the string.
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String");
		String sent = s.nextLine();
		String[]sent1= sent.split(" ");
		for (int i=0;i<sent1.length;i++) {
			int count =1;
			for (int j=i+1;j<sent1.length;j++) {
				if(sent1[i].equalsIgnoreCase(sent1[j])) {
					count++;
				}
			}
			if(sent1[i]!= "" && count==1) 
				System.out.print(sent1[i] + " ");
		}
	}

}
