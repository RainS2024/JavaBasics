package Advanced_Java_Day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtilty {

	public static String ReadingdatafromPropertyfile(String Path,String Key) {
		File file = new File (Path);
		FileInputStream fi = null;
		Properties propFile = new Properties();	
			String data = null;
			try {
				fi=new FileInputStream(file);
				propFile.load(fi);
				data = propFile.getProperty(Key,"garima.symbiosis@gmail.com");
				fi.close();
			}
			catch (FileNotFoundException e) {
				System.out.println("----error in file path---");
				e.printStackTrace();
			}
			catch(IOException e) {
			
				System.out.println("----error while loading file---");
				e.printStackTrace();
			}
			return data;
			
			}
	
	
	
	public static void WriteDatatoPropertyFile(String Path,String Key,String Value) {
		Properties propFile = new Properties();	
		propFile.setProperty(Key, Value);
		FileOutputStream fo = null;
		File file = new File (Path);
		try {
			fo=new FileOutputStream(file,true);
			propFile.store(fo,"adding new properties with value");
			fo.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("----error in file path---");
			e.printStackTrace();
		}
		catch(IOException e) {
		
			System.out.println("----error while loading file---");
			e.printStackTrace();
		}
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WriteDatatoPropertyFile("/Users/niwas/Desktop/Java Folder/Java Basics/Resources/info.properties","email","pihu@gmail.com");
		//String ReadingdatafromPropertyfile("/Users/niwas/Desktop/Java Folder/Java Basics/Resources/info.properties","email");
	}

}
