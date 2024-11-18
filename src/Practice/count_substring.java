package Practice;
import java.util.Scanner;
public class count_substring {
// counting of substring
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner S = new Scanner (System.in);
System.out.println("Enter the sentence you want to count the words");
String Sentence = S.nextLine();
System.out.println("OK");
String [] mysent = Sentence.split(" ");
for(String s:mysent) {
System.out.print(s);
	}
System.out.println("No.of words in the string is : " + mysent.length);

}
}
