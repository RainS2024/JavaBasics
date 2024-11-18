package Advanced_Java_Day6;

import java.util.ArrayList;
import java.util.Arrays;
//Method to remove all occurrences of a specific value from a List 
public class Arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> Marks =new ArrayList<Integer>(Arrays.asList(25,30,40,25,30,20,10,40,3,9,3));
		System.out.println(Marks);
		Marks.removeAll(Arrays.asList(30));
		System.out.println("After removing all 30 the array is : ");
		System.out.println (Marks);
		
		

ArrayList<String> Names =new ArrayList<String>(Arrays.asList("Garima","Garima","Navya","Pihu","Navya"));
System.out.println(Names);
Names.removeAll(Arrays.asList("Garima"));
System.out.println("After removing all Garima , the array is : ");
System.out.println (Names);
	}
	

}
