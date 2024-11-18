package Advanced_Java_Day8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem4 {
	//Read a file content and reverse each words in it and write it back to the same file. 
	//method to reverse a string	

	
	public static void ReadingandwritingfileusingReader() throws IOException{
		String Dirpath= System.getProperty("user.dir");
		//System.out.print(Dirpath);
		File myfile = new File (Dirpath + "/Resources/Data1.txt");
		FileReader rd = new FileReader(myfile);
		int ch;
		StringBuilder sb= new StringBuilder();
		while ((ch=rd.read())!=-1) {
			System.out.print((char)ch);	
			sb.append((char) ch);
		}

		System.out.println();
		System.out.println("-------------");
		System.out.print(sb);
		System.out.println();
		sb.reverse();
		System.out.print(sb);
		
	   String Dirpath1= System.getProperty("user.dir");
		//System.out.print(Dirpath);
		File myfile2 = new File (Dirpath1 + "/Resources/Data1.txt");
		FileWriter wrt = new FileWriter(myfile2,true);
		//StringBuilder Data = sb;
		System.out.println();
		wrt.append("\n" + sb);
		System.out.println();
		wrt.flush();
		wrt.close();
		System.out.println();
		System.out.println("Writing completed");
	
		
		
		}
	
	
public static void main(String[] args) throws IOException {
	ReadingandwritingfileusingReader() ;
	
}
    


}
