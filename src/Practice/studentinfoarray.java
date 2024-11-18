package Practice;
import java.util.Scanner;
public class studentinfoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String name;
int id;
double GDP;
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
System.out.println();
System.out.println("Enter the Student id's");
for (int j=0;j<n;j++) {
	Studentid[j]=s.nextInt();
}
System.out.println();
System.out.println("Enter the Student GDP");
for (int k=0;k<n;k++) {
	StudentGDP[k]=s.nextDouble();
}

System.out.println();
for (int i=0;i<n;i++) {
	System.out.print(StudentName[i] + ",");
	}
System.out.println();
for (int j=0;j<n;j++) {
	System.out.print(Studentid[j] + ",");
}
System.out.println();
	for (int k=0;k<n;k++) {
		System.out.print(StudentGDP[k] + ",");	

	}
	
}
}

