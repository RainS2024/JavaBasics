package TrainingDay3;

//Exercise Prb 4

public class Rectangle {
String Name;	
int Length;
int Width;
int Area;


Rectangle(String Name ,int Length,int Width,int Area){
	this.Name = Name;
	this.Length= Length;
	this.Width= Width;
	this.Area= Area= Length*Width;
	
}
void display() { 
	System.out.println(Name + " " + Length + " " + Width + " " + Area);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle R1 = new Rectangle("Rectangle A-",5,4,5*4);
Rectangle R2 = new Rectangle ("Rectangle B-",8,5,8*5);
R1.display();
R2.display();
	}

}
