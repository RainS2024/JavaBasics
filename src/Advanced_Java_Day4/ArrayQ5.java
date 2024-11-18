package Advanced_Java_Day4;
import java.util.Scanner;
public class ArrayQ5 {
//5. check the given string is palindrome or not 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter the string you want to check as palindrome or not");
String sent = s.nextLine();
char[] sent1= sent.toCharArray();
int n = sent1.length;
boolean flag=true;
for (int i=0;i<n/2;i++) {
	if (sent1[i]!=sent1[n-1-i]) {
		flag=false;
		break;
	}
	
}
if (flag==false) {
	System.out.println(sent +" is not a palindrome " );
}
else {
	System.out.println(sent + "is a palindrome");
}
	}

}
