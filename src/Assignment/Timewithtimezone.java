package Assignment;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Timewithtimezone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SimpleDateFormat Date_Format = new SimpleDateFormat("hh:mm:ss z");
Date date = new Date ();
String current_time_zone = Date_Format.format(date);
System.out.println(current_time_zone);
	}

}
