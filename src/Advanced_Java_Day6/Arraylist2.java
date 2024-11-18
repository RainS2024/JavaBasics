package Advanced_Java_Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Arraylist2 {
//remove duplicate elements in the array list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//by LinkedHashset		
		
ArrayList<Integer> Marks =new ArrayList<Integer>(Arrays.asList(25,30,40,25,30,20,10,40,3,9,3));
System.out.println(Marks);
LinkedHashSet<Integer> Uniquemarks= new LinkedHashSet<Integer>(Marks);
System.out.println(Uniquemarks);

ArrayList<String> Names =new ArrayList<String>(Arrays.asList("Garima","Garima","Navya","Pihu","Navya"));
System.out.println(Names);
LinkedHashSet<String> Uniquenames= new LinkedHashSet<String>(Names);
System.out.println(Uniquenames);

//By using stream
ArrayList<Integer> Marks1 =new ArrayList<Integer>(Arrays.asList(25,30,40,25,30,20,10,40,3,9,3));
System.out.println(Marks1);
List<Integer>Uniquemarks1=Marks1.stream().distinct().collect(Collectors.toList());
System.out.println(Uniquemarks1);



	}
	
}
