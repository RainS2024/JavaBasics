package Assignment;

public class Areaoftriangle {

	int base;
	int height;
	int Area;
	
	public void CalcArea() {
	Area = (base*height)*1/2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Areaoftriangle T = new Areaoftriangle() ;

T.base = 10;
T.height = 30;
T.CalcArea();

System.out.println("The base of the triangle T is :" + T.base);
System.out.println("The height of the triangle T is:" + T.height);
System.out.println("The Area of the Triangle T is:" + T.Area);

	}

}
