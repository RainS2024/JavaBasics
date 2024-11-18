package Advanced_Java_Day5;
import java.util.Scanner;
//Accept userinput of even number
public class exceptiontest {

	public static void read() throws Myexception {
		Scanner reader= new Scanner (System.in);
		System.out.println("Enter an even number");
		int n= reader.nextInt();
		if(n%2!=0) {
			throw new Myexception();
		}
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	boolean condition = false;	
	while(!condition) {	
		try {
			read();
			System.out.println("Condition met end of programme");
			Scanner reader = null;
			
		} catch (Myexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		{
	}

}
}
}


