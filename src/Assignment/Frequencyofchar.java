package Assignment;

public class Frequencyofchar {
//Find the frequency of the given character in the given string.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S = "I love California";
int Totalcount = S.length();
System.out.println("The Total count of character in the string is :" + Totalcount);

int Count_after_replacement= S.replace ("a", "").length();
System.out.println("The Total count of character in the string after replacing a with space is :" + Count_after_replacement);

int Count_of_Character = (Totalcount - Count_after_replacement);
System.out.println("The Frequency of character a in the string is :" + Count_of_Character);

	}

}
