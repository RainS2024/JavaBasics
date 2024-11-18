package Advanced_Java_Day4;

import java.util.Scanner;

//1. add all the elements in the given array of size n 
public class ArraysQ1 {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of the array");
int n= s.nextInt();
int[]num = new int [n];
System.out.println("Enter the elements of the array");
	for(int i=0;i<num.length;i++) {
		if(s.hasNextInt()) {
		num[i]=s.nextInt();}	
	}
	System.out.println("The array is :");
	for (int i=0;i<num.length;i++)	{
		System.out.print(num[i]+ ",");
	}
	int sum=0;
	for (int i=0;i<num.length;i++) {
		sum = sum + num[i];
	}
    System.out.println();
	System.out.print("The sum of all the array elements is :" + sum);


	
		}
		
	

	
	}
	


	


