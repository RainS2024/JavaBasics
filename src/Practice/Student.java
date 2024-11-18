package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable {
	
	//private variable to be accessed by getter and setters
	
	private String Name ;
	private double Grade;
	private int TotalMarks;
	static String University= "Tekarch";
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}

	public int getTotalMarks() {
		return TotalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		TotalMarks = totalMarks;
	}
		
	//parameterize the constructor to take the details of the object created for the class Student.	
	public Student(String Name,double Grade, int TotalMarks,String University){
		
	this.Name=Name;
	this.Grade=Grade;
	this.TotalMarks=TotalMarks;
	this.University= University;
	
	}

	
	//override the to string method to get the object printed on console
	public String toString() {
		return "Student { Name= " + Name + " ,Grade= " + Grade + ",TotalMarks= " + TotalMarks +  "," + University + " }";
	}
	
	
	/*public int compare(Student s1,Student s2) {
	
		// TODO Auto-generated method stub
		return s1.getName().compareTo(s2.getName());
	}
	*/
	
	@Override
	public int compareTo(Object o) {
		Student ob= (Student)o;
		// TODO Auto-generated method stub
		return this.Name.compareTo(ob.Name);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.TotalMarks+(int)this.Grade+this.Name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student ob = (Student) obj;
		// TODO Auto-generated method stub
		if(this.Name.equals(ob.Name)&& this.TotalMarks==ob.TotalMarks && this.Grade==ob.Grade)
		return true;
		else return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Enter student details in array using Scanner class
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		Student[] StuDetails = new Student[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name of the student");
			String name =s.next();
			System.out.println("Enter the Grade of the student");
			double Grade = s.nextDouble();
			System.out.println("Enter the Total marks of the student");
			int TotalMarks = s.nextInt();
			Student A = new Student(name,Grade,TotalMarks,University);
			StuDetails[i]=A;
		}
		
		//Search the student by entering name or grade
		System.out.println("Enter the name of student you want to search");
		String namesearch = s.next(); 
		for(int j=0;j<n;j++) {
			if(StuDetails[j].getName().equalsIgnoreCase(namesearch)) {
				System.out.println(StuDetails[j]);	
			}}
			
			System.out.println("Enter the Grade you want to search for student");
			double gradesearch = s.nextDouble(); 	
			for(int k=0;k<n;k++) {
				if(StuDetails[k].getGrade()== gradesearch) {
					System.out.println(StuDetails[k]);	
				}	
			}
			
			//Q: Sort the student list based on Name attribute
			//used Arrays.asList to convert Array to List 
			//and then used the Collections utility to sort the name on compareTo
			
			List<Student> studentList = Arrays.asList(StuDetails);
		
				
			
			System.out.println("Insertion ordered list of students:");
	        for (Student student : studentList) {
	            System.out.println(student);
	        }
	        
	        
	        Set<Student> uniqueStudentlist = new HashSet<Student>(studentList);
	        System.out.println("Ascending list of students");
	        for (Student student : uniqueStudentlist) {
	            System.out.println(student);
	        }
	        
	        Set<Student> Ascendinglist = new TreeSet<Student>(studentList);
	        System.out.println("Ascending unique list of students ");
	        for (Student student : Ascendinglist) {
	            System.out.println(student);
	        }
			/*System.out.println(StuDetails[i]);
			System.out.println("The Names of the students is " + StuDetails[i].getName());
			System.out.println("The Grades of the students is " + StuDetails[i].getGrade());
			System.out.println("The Total Marks of the students is " + StuDetails[i].getGrade());*/
			
		
	      
	        
		}

	


	
	
		
	}




