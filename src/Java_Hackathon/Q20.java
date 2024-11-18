package Java_Hackathon;

import java.util.Scanner;

//Q20. WJP to find total number of repeated integers, uppercase and lowercase character in the give string

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String");
		String Word =s.nextLine();
		String Word1=Word.replaceAll(" ", "");
		char []Word3 = Word1.toCharArray();
		
	int upper=0,lower=0,integers=0;
	for(int i=0;i<Word3.length;i++) {
		for(int j=i+1;j<Word3.length;j++) {
		char ch=Word3[i];
				
			if (ch>='A'&& ch<='Z'&& Word3[i]==Word3[j])
				upper++;
			else if(ch>='a'&& ch<='z'&& Word3[i]==Word3[j])
				lower++;
			else if(ch>='0'&& ch<='9'&& Word3[i]==Word3[j])
				integers++;	
	}
		
	}
	System.out.println("The number of repeated integers : " +  integers);
	System.out.println("The total number of repeated Uppercase : " + upper);
	System.out.println("The total number of repeated Lowercase : " + lower);
	}
}


