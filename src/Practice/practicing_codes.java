package Practice;
import java.util.Scanner;
public class practicing_codes {
//Even number and odd number in array
	
public static int[] ArrayInit() {
	Scanner S = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n = S.nextInt();
	int []Array= new int [n];
	System.out.println("Enter the array elements");
	for(int i=0;i<n;i++) {
		Array[i] = S.nextInt();
		}
	System.out.print("The array is:");
	for (int j=0;j<Array.length;j++) {		
			System.out.print(Array[j] + ",")	;
		}
	return Array;

}

public static int[]EvenArray(int Array[]){
	
	System.out.println("The even numbers in the array is:");	
	for (int i=0;i<Array.length;i++) {
		if(Array[i]%2==0) 
			System.out.println(Array[i]);	
		
	}	
	return Array;
	
}

public static int[]OddArray(int Array[]){

	System.out.println("The odd numbers in the array is:");	
	for (int i=0;i<Array.length;i++) {
		if(Array[i]%2!=0) 
			System.out.println(Array[i]);	
		
	}	
	return Array;
	
}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int Array1[]=ArrayInit();
	System.out.println();
	int Array2[]= ArrayInit();
	int newArray[] = new int[Array1.length];
	
	
	 if (Array1.length != Array2.length) {
         System.out.println("Arrays must be of the same length to compute the sum.");
         return;
     }
	
	for(int i=0;i<Array1.length;i++) {
		if(Array1[i]%2==0 && Array2[i]%2==0) {
					newArray[i] = Array1[i]+ Array2[i];
				}	
		else if((Array1[i]%2!=0 && Array2[i]%2!=0))
			newArray[i]= Array1[i]*Array2[i];
}
	System.out.println();
	System.out.println("The new Arrays formed ");	
		for(int j =0;j<newArray.length;j++) {
			System.out.print(newArray[j]+ ",");
		}
	
		
	}}

