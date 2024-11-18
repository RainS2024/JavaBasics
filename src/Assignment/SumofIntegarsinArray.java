package Assignment;
import java.util.Scanner;
public class SumofIntegarsinArray {
//Sum of Integars in array with userinput
	public static void main(String[] args) {

		// TODO Auto-generated method stub
	Scanner s = new	Scanner(System.in);
	System.out.println("Enter the size of the array");
	int arraysize = 0;
	arraysize = s.nextInt();
	
	int array[]= new int[arraysize];
	
	System.out.println("Enter the elements of the array");	
	for (int i=0;i<arraysize;i++)
	{
		if(s.hasNextInt()) {
			
			array[i]= s.nextInt();
		}
	}
	System.out.println("The elements of the array are : ");
	for (int i=0;i<arraysize;i++) {
		System.out.print(array[i] + " ");
	}
	int length = array.length;
	int sum=0;
	for (int i=0;i<length;i++)
	{
		sum= sum +array[i];}

	System.out.println();
		System.out.println("Sum of integars in Array is : = " + sum);
	}
	
	}

	
	

