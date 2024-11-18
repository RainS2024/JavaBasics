package Advanced_Java_Day6;

import java.util.ArrayList;
import java.util.Scanner;

import Advanced_Java_Day1.Student;

public class Studentarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
      ArrayList<Student>A1=new ArrayList<Student>();
      System.out.println("Enter the number of students");
		int n = s.nextInt();
		Student[]student=new Student[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name of the student");
			String Name = s.next();
			System.out.println("Enter the Student id");
			int ID = s.nextInt();
			System.out.println("Enter the Student Grade");
			double Grade= s.nextDouble();
			Student S=new Student(Name, ID, Grade);
			A1.add(S);
		}
   System.out.print(A1);
					

	}
	}


