package Java_Hackathon;

import java.util.Scanner;

//Q16. Write a method that will remove given character from the String?
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String");
		String Word =s.nextLine();
		String Word1 = Word.replace("a" ," ");
		System.out.println( "The new string is:" + Word1);
		s.close();
	}

}
