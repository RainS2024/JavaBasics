package Java_Hackathon;

import java.util.Scanner;

//WJP to perform ascending order using Selection  sort technique
public class Q6 {

	public void selectionsort(int[]Array) {
		int n = Array.length;
		for (int i=0;i<n-1;i++) {
			int lower = i;
			for (int j=i+1;j<n;j++) {
				if (Array[j]<Array[lower])
					lower=j;}		
			int temp = Array[lower];
			Array[lower]=Array[i];
			Array[i]=temp;
			}
		}
	public void print(int[]Array) {
		int n= Array.length;
		for(int j=0;j<Array.length;j++) {
			System.out.print(Array[j] + ",");	
		}
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
		System.out.println("The elements of the array are: ");
		for(int j =0;j<Array.length;j++)
			System.out.print(Array[j] + " ");	
		
		    Q6 ob=new Q6();
		    ob.selectionsort(Array);
		    System.out.println();
		    System.out.println("The elements of the array after selection sort is: ");
		    ob.print(Array);
		    s.close();
			
			
}
	}



				
	
		





