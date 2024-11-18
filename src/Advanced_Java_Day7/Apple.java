package Advanced_Java_Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S1= "i go and find an Apple";
String S2=S1.replaceAll(" " ,"");
char [] S3=S2.toCharArray();
Arrays.sort(S3);
String string = new String(S3);

System.out.println(string);	


	}

}
