package Advanced_Java_Day5;

public class Myexception extends Exception {
@Override
public void printStackTrace() {
	System.out.println("You entered an odd Number");	
}
@Override
	public String getMessage() {
	
		return ("Choose another number that is even");
	}

}
