package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Day3practice {
@Override
public String toString() {
	String N="";
	// TODO Auto-generated method stub
	return N;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Capitalizing
Scanner s = new Scanner (System.in);
System.out.println("Enter the string");
String Sent = s.nextLine();
System.out.println("The string before capitalizing is :" + Sent);
String[] sent1= Sent.split(" ");
String sentence ="";
for(int i=0;i<sent1.length;i++) {
	char c = sent1[i].charAt(0);
	String C1=String.valueOf(c).toUpperCase();
	String sub = sent1[i].substring(1);
	sentence = sentence + C1 + sub + " ";
}
System.out.println("The String after Capitalization of first letter is " + sentence);


//convert an array to string
int[]N = {1,2,3,4,5,6};
String N1 = Arrays.toString(N);
System.out.print(N1);
System.out.println();

//convert string to integer
String A = "1234";
int A1 = Integer.parseInt(A);
System.out.println(A1);
int x= 2345;
String X1=Integer.toString(x);//converts int to string
int sum = x+A1;
String sum1 = X1 + A1;
System.out.println(sum);//sum of int
System.out.println(sum1);//sum of strings is concatination

String Name = "Garima Singh";
char[]Name1 = Name.toCharArray();
for(char c:Name1) {
	System.out.print(c);//for loop prints char array
	
	
}
System.out.println();
System.out.print(Name.charAt(3));//character at an index
System.out.println();
System.out.print(Name.indexOf('a'));//prints the index value
System.out.println();


String Sentence = "Manhattan is in NewYork";
String substring = "is";
int Index= Sentence.indexOf(substring);//substring locating
if(Index!=-1) {
	System.out.println("The substring is present in the string at Index :" + Index);
}
else {
	System.out.println("The substring is not present in the given string");
}
//COUNT OF WORDS IN A STRING

String City = "Manhattan is in NewYork City which is in USA";
String[] City1 = City.split(" ");
int count=0;
for (int i=0;i<City1.length;i++) {
	count++;}
System.out.print("The count of the words in the string is--> " + count++);
	

	String State = "Manhattan is in NewYork City";
	String State2 = "Manhattan is in newyork city";
	System.out.println();
	System.out.println("----------------------");
	if(State.equalsIgnoreCase(State2)) {
		System.out.println("The two string are matching");}
	else {
		System.out.println("The strings are not matching");
}
}}




	


