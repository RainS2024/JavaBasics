package Advanced_Java_Day6;
import java.util.ArrayList;
import java.util.HashSet;
public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
ArrayList<Integer> A = new ArrayList<Integer>();
A.add(2);
A.add(5);
A.add(7);
A.add(2);
A.add(3);



System.out.println("The Array A is " + A);
System.out.println("Size of the array = " + A.size());
ArrayList<Integer>B= new ArrayList<Integer>();
B.add(5);
B.add(4);
B.add(3);
B.add(6);
B.add(2);
System.out.println("The Array B is " + B);
System.out.println("Size of the array = " + B.size());

//Write a program to find the unique elements in the list 
HashSet<Integer>hset= new HashSet<Integer>(A);
System.out.println("The unique elements in the Array A are " + hset);

//Write a java program to compare two ArrayList 
if(A.equals(B)==true) {
	System.out.println("The Array is equal");}
else {
	System.out.println("The Array is not equal");
	System.out.println();


ArrayList<String> C = new ArrayList<String>();
C.add("Garima");
C.add("Garima");
C.add("Navya");
C.add("Pihu");
C.add("Navya");

System.out.println("The Array C is " + C);

//program to find the unique elements in the list 
HashSet<String>hset2= new HashSet<String>(C);
System.out.println("The unique elements in the Array C are " + hset2);

System.out.println("Size of the array = " + C.size());
ArrayList<String>D= new ArrayList<String>();
D.add("Garima");
D.add("Madhu");
D.add("Navya");
D.add("Pihu");
D.add("Niwas");
System.out.println();
System.out.println("The Array D is " + D);
System.out.println("Size of the array = " + D.size());
//program to compare two ArrayList 
if(C.equals(D)==true) {
	System.out.println("The Array is equal");}
else {
	System.out.println("The Array is not equal");
	
}



	}
	}

	}
