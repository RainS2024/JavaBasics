package Advanced_Java_Day6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Array_Arraylist {

//write a java program to store array elements to Arraylist 	
	//if the array is integers we have to take for loop to convert int to Integers Array
public static void func(int[]arr) {
		ArrayList<Integer>array_list= new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
			array_list.add(new Integer(arr[i]));
		System.out.println(array_list);
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] array1 = {1,2,3};
System.out.println("The array to Array_List for integers: ");
func(array1);


Integer [] Numbers= {new Integer(5),new Integer(6)};	
List numbers = Arrays.asList(Numbers);
System.out.println ("The Arraylist of Integers" + numbers);

String[]Names = {"AA","BB"};
List A2= Arrays.asList(Names);		
System.out.println("The ArrayList of Names" + A2);
}
{



	}
}


