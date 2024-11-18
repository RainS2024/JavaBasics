package Advanced_Java_Day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_read_write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String Dirpath= System.getProperty("user.dir");
		System.out.println(Dirpath);
		File file = new File (Dirpath + "/Resources/info.properties");
		FileInputStream fi = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fi);
		String email = pro.getProperty("email");
		System.out.println(email);
		pro.setProperty("id", "100");
		FileOutputStream fo = new FileOutputStream(Dirpath + "/Resources/info.properties");
		pro.store(fo, "loaded");
		fo.flush();
		fo.close();
	}

}
