package Practice;
import java.util.Scanner;
import java.util.Arrays;
public class Frequency_array {
//counting the elements in a user defined array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of array");
int n = s.nextInt();
int [] array = new int [n];
System.out.println("Enter the elements in the array");
for(int i=0;i<array.length;i++) {
	array[i]=s.nextInt();
}
System.out.println("Tha Array before sorting is");
for(int i=0;i<array.length;i++) {
	System.out.print(array[i] + ",");
}
Arrays.sort(array);
System.out.println();
System.out.println("Tha Array after sorting is");
for(int i=0;i<array.length;i++) {
	System.out.print(array[i]+ ",");
}
for(int i=0;i<array.length;i++) {	
	int count=1;
	while(i+1<=array.length-1 && array[i]==array[i+1]) {
		count++;
		i++;
	}
	if (count==1) {
		System.out.println();
		System.out.println("The element " + array[i] + " is unique");
		
	}
	else {
		System.out.println();
		System.out.println("The count of the element " + array[i] + " is " + count);
		count=1;
	}
	
	
}


	}

}
