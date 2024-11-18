package Assignment;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TodaysDateandTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Date thisdate = new Date();
SimpleDateFormat sdf= new SimpleDateFormat("EEE,d MMM yyyy");
String date = sdf.format(thisdate);
System.out.println(date)	;	


//Date date1 = new Date();
//SimpleDateFormat s= new SimpleDateFormat("yyMMddHHmmss");
String newdate = new SimpleDateFormat("HHmmss").format(new Date());
System.out.println(newdate)	;	

	}

		
}
