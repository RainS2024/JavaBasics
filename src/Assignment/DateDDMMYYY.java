package Assignment;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDDMMYYY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(new Date ());
		System.out.println(date);
	}

}
