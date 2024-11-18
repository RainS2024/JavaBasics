package TrainingDay3;
import java.util.Scanner;
public class Student {
//Exercise Day-3 Prb 1 - Using Scanner
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner student=new Scanner (System.in);
System.out.println("Enter the Students Name");
String Name = student.next();
System.out.println("Enter the Roll Number");
int rollnum = student.nextInt();
System.out.println("------------------------");
System.out.println("The student name is :" + Name);
System.out.println("The student roll number is:" + rollnum);

student.close();



	}

}
