package Assignment;

public class AreaofCircle {

	int radius;
	double pi;
	double Area;
	double Perimeter;
	
	public void calcArea() {
		Area = pi*radius*radius;
	}
	public void calcPerimeter() {
		Perimeter = 2* pi * radius;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AreaofCircle A1 = new AreaofCircle();
A1.radius= 4;
A1.pi = 3.14;
A1.calcArea();
A1.calcPerimeter();
System.out.println("The radius of Circle A1 = " + A1.radius);
System.out.println("The Area of Circle=" + A1.Area);
System.out.println("The Perimeter of Circle = " + A1.Perimeter);
	}

}
