package Advanced_Java_Day2;

public class Function_overloading {
  int x;
  int y;
  int z;
  double pi = 3.14;
  //Largest of two numbers
  public int largest_num (int x, int y) {
	  if (x>y) {
		  return x;}
	  else {
		  return y;
		  }
	  }
  //Largest of three numbers
  public int largest_num (int x, int y,int z) {
	  if (x>y && x>z) {
		  return x;}
	   else if (y>x && y>z) {
		  return y;
		  }
	   else {
		   return z;
	   }
	  }
  
  //Area of a triangle
  
  public int area (int x, int y) {
	  int triangle = (x*y/2); //where x is base and y is height
	  return triangle;
  }
	//Area of a circle
  
  public double area (int x) {
	  double circle = (pi*x*x);
	  return circle;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function_overloading ob = new Function_overloading();
int Result = ob.largest_num(10,20);
int Result1 =ob.largest_num(10,20,30);
int Result3 = ob.largest_num(50,20);
int Result4 =ob.largest_num(10,70,30);
int Result5 = ob.area(5, 4);
double Result6 = ob.area(2);
	System.out.println("Largest of the number is " + Result);
	System.out.println("Largest of the number is " +Result1);
	System.out.println("Largest of the number is " +Result3);
	System.out.println("Largest of the number is " +Result4);
	System.out.println("The Area is " + Result5);
	System.out.println("The Area is " + Result6);
	}

}
