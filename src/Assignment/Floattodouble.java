package Assignment;

public class Floattodouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Float to Double	
float f = 3.14f;
double d = f;
System.out.print(d);

System.out.println();


float F = 234.56f;
String s = Float.toString(F);
double d1 = Double.parseDouble(s);
System.out.print(d1);

// Double to Float
System.out.println();
double d2 = 234.566667;
float f2 = (float)d2;
System.out.println(f2);
	}

}
