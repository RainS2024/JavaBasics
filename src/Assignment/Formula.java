package Assignment;

public class Formula {
//Specified Formulae
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11))
		double a = 4.0;
		
		double x = 1.0;
		double b= 3.0;
		double A= x/b;
		
		double c = 5.0;
		double B= x/c;
		
		double d= 7.0;
		double C= x/d;
		
		double e= 9.0;
		double D= x/e;
		
		double f = 11.0;
		double E=x/f;
		
		double sum = (x-A+B-C+D-E);
		
		double product = a*sum;
		
		System.out.println("Problem) Specified formulae" +"\n");
		System.out.println(" Answer= " + product);
	}

}
