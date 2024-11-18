package Java_Hackathon;

import java.util.Scanner;

//Q4. Given an array of integers check the Palindrome of the series.
public class Q4 {

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
		
		int n = Array.length;
		boolean flag=true;
		for (int i=0;i<n/2;i++) {
			if (Array[i]!=Array[n-1-i]) {
				flag=false;
				break;
			}
			
		}
		if (flag==false) {
			System.out.println("The array is not a palindrome " );
		}
		else {
			System.out.println("The Array is a palindrome");
		}
		s.close();
			}
	}


