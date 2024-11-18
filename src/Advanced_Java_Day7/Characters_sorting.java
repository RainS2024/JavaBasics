package Advanced_Java_Day7;

import java.util.ArrayList;
import java.util.Arrays;

public class Characters_sorting {
//Write a Java program to sort the characters in the string alphabetically 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//SORT the characters in a String		
String S1= "MY NAME IS GARIMA";
String S2=S1.replaceAll(" " ,"");
char [] S3=S2.toCharArray();
Arrays.sort(S3);
System.out.println(S3);

String Sent= new String("mango is my pet");
String Sent1= Sent.replaceAll(" " ,"");
char [] sent2= Sent1.toCharArray();
Arrays.sort(sent2);
System.out.print(sent2);



	}

}
