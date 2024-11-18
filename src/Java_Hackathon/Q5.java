package Java_Hackathon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//Q5 Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.
public class Q5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int array_size = s.nextInt();
		int Array[]=new int [array_size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<Array.length;i++) {
			if(s.hasNextInt()) {
				Array[i]=s.nextInt();
	
			}
		
	}
		ArrayList<Integer>List= new ArrayList<Integer>();
		for(int j=0;j<Array.length;j++)
			List.add(new Integer(Array[j]));
		System.out.println(List);
		System.out.println("The list of array elements are :" + List);
		HashSet<Integer>Unique= new HashSet<Integer>(List);
		System.out.println("The unique elements in the Array List are " + Unique);

	}
}
