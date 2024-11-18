package Practice;

import java.util.Scanner;

public class Studentinfo2 {
private String name;
private int id;
private double GDP;


	public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public double getGDP() {
	return GDP;
}


public void setGDP(double gDP) {
	GDP = gDP;
}
public void display() {
	System.out.println(name + " " + id + " " + GDP);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
	
		
		Scanner s = new Scanner (System.in);
		int n;
		System.out.println("Enter the number of student");
		n = s.nextInt();
		String [] StudentName = new String [n];
		int [] Studentid = new int [n];
		double [] StudentGDP = new double [n];
		System.out.println("Enter the name of Student");
		for (int i=0;i<n;i++) {
			StudentName[i]=s.next();	
		}
		System.out.println("The names of the students are");
		for (int i=0;i<n;i++) {
			System.out.print(StudentName[i] + ",");
		}
			System.out.println();
			System.out.println("Enter the Student id's");
			for (int j=0;j<n;j++) {
				Studentid[j]=s.nextInt();
			}
			System.out.println("The student id's are");
			for (int j=0;j<n;j++) {
				System.out.print(Studentid[j] + ",");	
		
		}
			System.out.println();
			System.out.println("Enter the Student GDP");
			for (int k=0;k<n;k++) {
				StudentGDP[k]=s.nextDouble();
				
			}
			System.out.println("The student GDPs are");
			for (int k=0;k<n;k++) {
				System.out.print(StudentGDP[k] + ",");	
		
		}		
		
	}
}

			
			
			
	/*		
			
		Studentinfo2 S1 = new Studentinfo2();
		System.out.println("Enter the name of student1");
		S1.name = s.next();
		System.out.println("Enter the id of student1");
		S1.id= s.nextInt();
		System.out.println("Enter the GDP  of student1");
		S1.GDP = s.nextDouble();
		
		
		Studentinfo2 S2 = new Studentinfo2();
		System.out.println("Enter the name of student2");
		S2.name = s.next();
		System.out.println("Enter the id of student2");
		S2.id= s.nextInt();
		System.out.println("Enter the GDP of student2");
		S2.GDP = s.nextDouble();
		S1.display();
		S2.display();
	}
}

	
/*
 * }
		System.out.println("Enter the name of Student");
		for (int i=0;i<n;i++) {
			StudentName[i]=s.next();	
		}
		System.out.println("The names of the students are");
		for (int i=0;i<n;i++) {
			System.out.print(StudentName[i] + ",");

			}


			}
		
	}
*/

