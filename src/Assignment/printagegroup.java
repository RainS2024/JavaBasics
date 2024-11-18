package Assignment;
import java.util.Scanner;
public class printagegroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner (System.in);
System.out.println("Enter Age:");
int Age = s.nextInt();
if (Age <=2) {
	System.out.println("The age group is toddler");}
	if (Age >2 && Age<=10){
		System.out.println("The Age is Kid");}
	if (Age >10 && Age <= 18) {
		System.out.println("The Age group is Children");}
	if (Age >18 && Age <= 30) {
		System.out.println ("The Age group is Young Adult");
	}
	if (Age >30 && Age <= 45) {
		System.out.println ("The Age group is Adult");
	}
	if (Age >45) {
		System.out.println ("The Age group is Old Adult");
	}
}
}


