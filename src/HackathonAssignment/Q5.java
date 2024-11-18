package HackathonAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

//Q5.	Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.
public class Q5 {
	
	static HashMap<Integer,Integer> findRepeating(int[]array,int size){
		HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer>();
		for(int i=0;i<size;i++) {
			if(frequency.containsKey(array[i])) {
				frequency.put(array[i], frequency.get(array[i])+1);
			}
			else {
				frequency.put(array[i], 1);
			}
			
		}
		return frequency;
	}
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

		
		HashMap<Integer,Integer>frequency =findRepeating(Array,array_size);
		System.out.println("The duplicate elements in the Array List are ");

		for(Map.Entry<Integer,Integer>entry:frequency.entrySet())
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+"----->" + entry.getValue());
	}
}

