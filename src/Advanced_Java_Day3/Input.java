package Advanced_Java_Day3;
import java.util.ArrayList;
import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter the String");
String Word =s.nextLine();
System.out.println( "The string you entered is:" + Word);
System.out.println("Choose what you would like to do");
System.out.println("Enter 1 : To remove a given character");
System.out.println("Enter 2 : To remove all the white spaces");
System.out.println("Enter 3 : To capitalize the first letter of each word");
System.out.println("Enter 4 : To find all the substring in a given string");
System.out.println("Enter 5 : To check if a given text is the rotation of a given text");
System.out.println("Input the number");
int n = s.nextInt();
switch(n) {
case 1:
	String Word1 = Word.replace("a" ," ");
	System.out.println( "The new string is:" + Word1);
	break;
case 2:
	String Word2 = Word.replace(" " ,"");
	System.out.println( "The new string is:" + Word2);
	break;
case 3:
	char [] sentence = Word.toCharArray();
	System.out.println("Before capitalizing the sentence: " + Word);
	System.out.println();
	for(int i=0;i<sentence.length;i++) {
		sentence[0]=Character.toUpperCase(sentence[0]);
		if (sentence[i]==' ') {
			sentence[i+1]= Character.toUpperCase(sentence[i+1]);
		}
		Word= String.valueOf(sentence);
	}
	System.out.println("After capitalizing the sentence: " + Word);

	break;
case 4:
	ArrayList<String>substring=new ArrayList<String>();
	for(int i=0;i<Word.length();i++) {
		for(int j=i+1;j<=Word.length();j++) {
			String sub=Word.substring(i, j);
			substring.add(sub);
		}
	}
	for(int k=0;k<substring.size();k++) {
		System.out.println(substring.get(k));
	}

	break;
case 5:
	StringBuilder neword= new StringBuilder(Word);
	StringBuilder neword1=neword.reverse();
String Reversed =neword1.toString();
	String Repeat = Word+Word;
	if(Repeat.contains(Reversed)) {
		System.out.println("The given text is rotation of anothe text");
	}
	else {
		System.out.println("It is not the reverse");
	}
	break;


}
}
}
