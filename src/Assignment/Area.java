package Assignment;

//print Area and Perimeter of Rectangle

public class Area {
	int Length;
	int Width;
	int AreaofR;
	int PerimeterofR;


	public void AreaofRectangle() {
		AreaofR = (Length*Width);
	}
	public void PerimeterofRectangle() {
		PerimeterofR= 2*(Length + Width);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Area r1 = new Area();
 
      r1.Length=5;
      r1.Width=10;
      r1.AreaofRectangle();
      r1.PerimeterofRectangle();
      System.out.println("The Length of rectangle r1=" + r1.Length);
      System.out.println("The width if rectangle r1=" + r1.Width);
      System.out.println("The Area of rectangle r1 =" + r1.AreaofR);
      System.out.println("The Perimeter of Rectangle = " + r1.PerimeterofR);
      
	}

}
;