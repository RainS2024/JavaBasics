package Advanced_Java_Day2;

public class wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//a) convert string to int
		
		String no ="1234";
		
		int myno = Integer.parseInt(no);
		System.out.println ("The value is = " + myno);
		int sum = myno +2;
		System.out.println(sum);
	
		//b) convert int to Integer
		int i=10;
		Integer a= new Integer (i);
		System.out.println(a);
		
		//c) convert Integer to float	
		float F = a.floatValue();
		System.out.println("The float value of F is :" + F);
		
		//d) convert int to string
		
		int I = 255;
		String S = String.valueOf(I);
		System.out.println(S);
		
		//e) find max of two numbers
		int x = 10;
		Integer X= new Integer(x);
		int y = 20;
		Integer Y = new Integer (y);
		System.out.println(X.max(x, y));
		System.out.println(X.min(x, y));
		
		int a1 = 20;
		int b= 30;
		int c = Math.max(a1, b);
		System.out.println("Maximum value out of two numbers is---> " + c);
		
		//f) find min of two float numbers
		float X1= 10.4f;
		float X2= 20.5f;
		Float F1=Float.valueOf(X1);
		Float F2 = Math.min(X1, X2);
		System.out.println(F1.min(X1, X2));
		System.out.println("Minimum of two float value is ---->" + F2);
		
	}

}
