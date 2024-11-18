package Java_Hackathon;
//Q14.WJP  Given a string print the reverse of the words in the string.(Input:  Java Code Output: Code Java)
import java.util.Scanner;

public class Q14 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter the sentence you want to reverese");
String sent = s.nextLine();
String[] sent1 = sent.split(" ");
System.out.println("The sentence was");
for (int i=0;i<sent1.length;i++) {
	System.out.print(sent1[i] + " ");
}
System.out.println();
System.out.println("Reversing the sentence by words");
for (int i=sent1.length-1;i>=0;i--) {
	System.out.print(sent1[i] + " ");
}


	}

}
