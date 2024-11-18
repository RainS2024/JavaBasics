package Advanced_Java_Day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

//Write a Java program to copy the contents of one text file to another. 

public class Problem3 {

	public static void Readingwritingfile() throws IOException{
		File file = new File ("/Users/niwas/Desktop/Java Folder/Java Basics/Resources/Data1.txt");
		FileInputStream fi = new FileInputStream(file);
		int ch;
		StringBuilder copy= new StringBuilder();
		while ((ch=fi.read())!=-1) {
			System.out.print((char)ch);	
			copy.append((char) ch);
		}
		System.out.println("-------------");
		System.out.print(copy);
	
		String Dirpath= System.getProperty("user.dir");
		//System.out.print(Dirpath);
		File file1 = new File (Dirpath + "/Resources/copy.txt");
		FileWriter wrt = new FileWriter(file1, true);
		wrt.append("\n" + copy);
		wrt.flush();
		wrt.close();
		System.out.println("Writing completed");
		
		
			
		}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Readingwritingfile() ;
	}

}
