package Assignment;

public class functionoverloading {
//find maximum of two num and maximum of 3 numbers using function overloading

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Maxofnum = Maxnum(3,2);
int Maxofnum2 = Maxnum(3,7,6);
System.out.println("Maximum of two numbers is: " + Maxofnum);
System.out.println("Maximum of three numbers is: " + Maxofnum2);
}
	
	public static int Maxnum(int a,int b) {
		if (a>b)
			return a;
		else
			return b;
	}	
	
	public static int Maxnum(int a,int b,int c) {
		if (a>b && a>c)
			return a;
		if (b>a && b>c)
			return b;
		else
			return c;
	}
}


