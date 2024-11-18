import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UniqueName = new SimpleDateFormat("yy MM dd HHmmss").format(new Date(0));
		System.out.println(UniqueName);
	}

}
