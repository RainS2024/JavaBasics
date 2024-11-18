package Practice;

public class Testexception extends Exception  {

	@Override
	public void printStackTrace() {
		System.out.println("I am trying different methods");
		
	}
	@Override
	public String getLocalizedMessage() {
		System.out.println("What is the cause");
		return null;
	}
	}

