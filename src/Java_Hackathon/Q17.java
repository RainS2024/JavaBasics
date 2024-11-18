package Java_Hackathon;

import java.util.Scanner;

//Q17.  WJP to find total number of integers, uppercase and lowercase character in the give string
public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String");
		String Word =s.nextLine();
	int upper=0,lower=0,integers=0;
	for(int i=0;i<Word.length();i++) {
		char ch = Word.charAt(i);
				{
			if (ch>='A'&& ch<='Z')
				upper++;
			else if(ch>='a'&& ch<='z')
				lower++;
			else if(ch>='0'&& ch<='9')
				integers++;
		}
	}
		System.out.println("The total number of integers : " + integers);
		System.out.println("The total number of Uppercase : " + upper);
		System.out.println("The total number of Lowercase : " + lower);
	}
	

}
