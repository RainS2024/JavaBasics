package Java_Hackathon;
import java.util.Arrays;
import java.util.Scanner;
//Given an array of integers, sort the integer values.
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of the Array");
int array_size = s.nextInt();
int Array[]=new int [array_size];
System.out.println("Enter the elements of the array");
for(int i=0;i<Array.length;i++) {
	//if(s.hasNextInt()) {
		Array[i]=s.nextInt();
	}
//}
System.out.println("The elements of the array are: ");
for(int i =0;i<Array.length;i++)
	System.out.print(Array[i] + " ");
Arrays.sort(Array);
System.out.println();
System.out.println("The elements of the array after sorting are: ");
for(int i =0;i<Array.length;i++)
	System.out.print(Array[i] + " ");
s.close();
	}

}
