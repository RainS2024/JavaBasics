package Advanced_Java_Day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//Implement a Java program that reads a file and counts the number of words in it.

public class Problem2 {
	

public static void ReadingfileIputStream() throws IOException{
File file = new File ("/Users/niwas/Desktop/Java Folder/Java Basics/Resources/Data.txt");
FileInputStream fi = new FileInputStream(file);
int ch;
StringBuilder sb= new StringBuilder();
while ((ch=fi.read())!=-1) {
System.out.print((char)ch);
sb.append((char) ch);	
		}	
System.out.println();
System.out.println("-------------");
System.out.print(sb);
int total=1;
for (int i=0;i<sb.length();i++) {
	if ((sb.charAt(i)== ' ') && (sb.charAt(i+1)!= ' ')) {
		total++;
	}
}
System.out.println();
System.out.println("The total count of words in the string is : "+ total);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadingfileIputStream();
		
	}

}
