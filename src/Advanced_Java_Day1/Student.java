package Advanced_Java_Day1;
import java.util.Scanner;
public class Student {
/*	Create the student class with name, university, id, GDP. Read number of students and store the student information. use constructors. private properties with getters and setters. Set university as "tekarch" for all the students. write the functions for the following. 

	i) Read all the student information by name. 

	ii) Read all the student information by id. 

	iii)  print all student information 

	iv)     update the student GDP using student id 
	
*/
private String Name;
private int ID;
private double Grade;
static String University = "Tekarch";
	
public Student(String name,int ID,double GDP) {
	this.Name= name;
	this.ID= ID;
	this.Grade = GDP;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	this.Name = name;
}

public int getID() {
	return ID;
}

public void setID(int ID) {
	this.ID = ID;
}

public double getGrade() {
	return Grade;
}

public void setGrade(double GDP) {
	this.Grade = GDP;
}

static void findbyname(Student[]students,String namefind) {
	for (int i=0;i<students.length;i++) {
		if(students[i].getName().equalsIgnoreCase(namefind)) {
			System.out.println("The id is " + students[i].getID()+ " & The Grade is " + students[i].getGrade());
		}
	}
}
static void findbyid(Student[]students,int findid ) {
			for (int i=0;i<students.length;i++) {
				if(students[i].getID()==findid) {
					System.out.println("The Name is " + students[i].getName() + " & The Grade is " + students[i].getGrade() );
					System.out.println("Would you like to update the GDP?");
					System.out.println("Enter Y for Yes and N for No");
					Scanner in = new Scanner (System.in);
					char answer = in.next().charAt(0);
					if(answer=='Y')
						findidandchange(students,findid);	
					in.close();
					}
			}
}
				
		
			
				static void findidandchange(Student[]students,int findid) {
					for(int i=0;i<students.length;i++) {
						if(students[i].getID()==findid) {
							System.out.println("Enter the new GDP");
							Scanner scan = new Scanner (System.in);
					       double grade = scan.nextDouble();
							students[i].setGrade(grade);
							System.out.println(students[i].getName()+ " " + students[i].getID()+ " The new GDP is " + students[i].getGrade()+ " " + University);
							scan.close();
						}	
	}
}
	
@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.Name + "," + this.ID + "," + this.Grade ;
		}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner (System.in);
System.out.println("Enter the number of student");
int n = s.nextInt();	
Student[]students = new Student[n];	
for (int i=0;i<n;i++) {
	System.out.println("Enter the name of the student");
	String name =s.next();
	System.out.println("Enter the student id");
	int ID = s.nextInt();
	System.out.println("Enter the Grade");
	double GDP = s.nextDouble();	
 Student A= new Student (name,ID,GDP);
 students[i] =A;
 }
s.close();
for (int i=0;i<students.length;i++)	{
	//Student A = students[i];
	System.out.println(students[i].getName()+ " " + students[i].getID()+ " " + students[i].getGrade()+ " " + University);
}
				
 System.out.println("Enter the name of the student you want to find");
 String namefind= s.next();
 findbyname(students,namefind);
 System.out.println("Enter the id of the student you want to find");
 int findid = s.nextInt();
 findbyid(students,findid);


   

	
	

}
	}

	
	
