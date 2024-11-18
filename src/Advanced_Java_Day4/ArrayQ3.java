package Advanced_Java_Day4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n= s.nextInt();
		int[]num = new int [n];
		System.out.println("Enter the elements of the array");
			for(int i=0;i<num.length;i++) {
				if(s.hasNextInt()) {
				num[i]=s.nextInt();}	
			}
			System.out.println("The array is :");
			for (int i=0;i<num.length;i++)	{
				System.out.print(num[i]+ ",");
				System.out.println();
			}
		  /* for(int i=0;i<n;i++) {  //1st method
				int cnt=0;
				for(int j=0;j<n;j++) {
					if(num[i]==num[j])
						cnt++;
				}
				if (cnt==1) {System.out.println("The unique elements are : " + num[i]);
			}}
			*/
			Arrays.sort(num);  //2nd method which picks up the unique value for each element 
			System.out.println("The unique element in array is :");
			for (int i=0;i<n;i++) {
				while(i<n-1 && num[i]==num[i+1]) {
					i++;
				}
				
				System.out.print(num[i]+",");
			}
	}

}
