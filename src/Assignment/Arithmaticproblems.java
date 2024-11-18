package Assignment;
//Arithmatic operations
public class Arithmaticproblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//a) -5+8*6
		System.out.println("Problem a) -5 + 8 *6");
		int a= -5;
		int b = 8;
		int c= 6;
		int product = b*c;
		int output = a+product;
		System.out.println("Answer= " + output +"\n");
//b) 55+9%9
		System.out.println("Problem b) 55+9%9");
		int a1= 55;
		int b1= 9;
		int addition = a1+b1;
		int c1= 9;
		int output1 = addition%c1;
		System.out.println("Answer=" + output1 + "\n");
//c 20+ -3*5/8
		System.out.println("Problem c) 20 + -3*5/8");
		int a2= 20;
		int b2=-3;
		double c2=5;
		double d2=8;
		double div = c2/d2;
		double multiply=b2*div;
		double output2=a2+ multiply;
		double rounded = Math.round(output2);
		System.out.println("Answer=" + rounded + "\n");
		
//d)5+15/3*2-8%3
	   int a3=5;
	   int b3=15;
	   int c3=3;
	   int d3=2;
	   int e3= 8;
	   int div3 = b3/c3;
	   int product3=div3*d3;
	   int sum3= a3+product3;
	   int modulus = e3%c3;
	   int output3 = sum3-modulus;
	   
	   System.out.println("Problem d) 5+15/3*2-8%3 " + "\n");
	   System.out.println("8%3=" + modulus);
	  System.out.println(output3);
	  
	   
	   
	   
	   
			   
		
	}

}
