package Assignment;
import java.util.Scanner;
public class table {
//Multiplication Table taking input from user
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S =new Scanner(System.in);
		System.out.println("Enter the number for Table output");
			int number =S.nextInt();
			System.out.println("------------------");

			int i = 1;
for (i=1;i<=10;i++)
System.out.println(number +"*"+i+"="+ number*i);
	}

}
