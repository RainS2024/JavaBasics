package Advanced_Java_Day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteTest {

 public static void ReadingfileIputStream() throws IOException{
	File file = new File ("/Users/niwas/Desktop/Java Folder/Java Basics/Resources/Data.txt");
	FileInputStream fi = new FileInputStream(file);
	int ch;
	while ((ch=fi.read())!=-1) {
		System.out.print((char)ch);
		
	}
 }
	public static void WritetofileusingoutputStream() throws IOException{
		String Dirpath= System.getProperty("user.dir");
		//System.out.print(Dirpath);
		File file = new File (Dirpath + "/Resources/Data1.txt");
		FileOutputStream fo = new FileOutputStream(file);
		String Data= "I am adding sentences \n second line";
		char[]chararray=Data.toCharArray();
		for(char c:chararray) {
			fo.write(c);
		}
		
		fo.flush();
		fo.close();
		System.out.println("Writing completed");
			
		}
	
	public static void ReadingfileusingReader() throws IOException{
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
		}

	public static void WritetofileusingWriter() throws IOException{
		String Dirpath= System.getProperty("user.dir");
		//System.out.print(Dirpath);
		File myfile = new File (Dirpath + "/Resources/Data.txt");
		FileWriter wrt = new FileWriter(myfile);
		wrt.write( "\n I am adding sentences by using writer");
		wrt.flush();
		wrt.close();
		System.out.println("Writing completed");
			
		}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//WritetofileusingoutputStream() ;
		//ReadingfileusingReader() ;
		WritetofileusingWriter();
	}

}
