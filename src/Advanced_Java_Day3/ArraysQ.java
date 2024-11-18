package Advanced_Java_Day3;
import java.util.*;
public class ArraysQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String friends[]= {"Madhu","Navya","Alisha"	};
String Newfriends=Arrays.toString(friends);
System.out.println(Newfriends);

//
String names = "Madhu";
String a= names.toString();//converts to string
System.out.println(a);

//2.String to integer

String number = "1234";
int no= Integer.parseInt(number);//converts to int
Integer no1= Integer.valueOf(number);//converts to Integer
System.out.println("String 1234 to int: " + no);
System.out.println("String 1234 to Integer:" + no);

//3.int to string

int x= 456;
int y= -456;
String Y = Integer.toString(y);
String X= Integer.toString(x);//not possible to do Math functions with string value it throws error
int sum = x+y;

System.out.println("String value of y=" + Y);
System.out.println("String value of x=" + X);
System.out.println("Sum of x & y = " + sum);	

//4.string to char array
String day = "Monday";
char Day[] = day.toCharArray();
for (char i:Day) { // for each method for printing
System.out.print("," + i);

	}
System.out.println();
String day2 = "Tuesday";
char Day2[]= new char[day2.length()];
for (int i=0;i<day2.length();i++) {
	Day2[i]= day2.charAt(i);
}
for (int i =0;i<day2.length();i++) {
	System.out.print(Day2[i] + ",");
}
//5. find character at a given location
String color = "violet";
System.out.println();
System.out.println(color.charAt(3));

//6. find index of character at a given location
String color2 = "violet";
System.out.println(color2.indexOf('o'));

//7.check whether the given substring present in the given string or not
String Horse = "Horse is my favorite animal";
String substring = "Pet";
int Index = Horse.indexOf(substring);
if (Index!=-1) {
System.out.println("The substring is present in the given string");}
else {
System.out.println("The substring is not present in the given string");}


//8.count the number of words in a given string

String sweets = "Gulabjamun is my favorite";
int total=1;
for (int i=0;i<sweets.length();i++) {
	if ((sweets.charAt(i)== ' ') && (sweets.charAt(i+1)!= ' ')) {
		total++;
	}
}

System.out.println("The total count of words in the string is : "+ total);

//9.check if two strings are the same ignoring their cases. 

String Mango = "Mango is a petbird";
String Mango2 = "MANGO is a Petbird";
String Dog = "Ruffle is my Dog";
System.out.println(Mango.equalsIgnoreCase(Mango2));
System.out.println(Dog.equalsIgnoreCase(Mango2));
}

}

