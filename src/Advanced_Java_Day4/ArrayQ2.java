package Advanced_Java_Day4;

import java.util.Scanner;

//2. find maximum element in the array 	
public class ArrayQ2 {
		
	
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
			}
			
			int max=num[0];
			for(int i=1;i<num.length;i++) {
				if (num[i]>max);
				max=num[i];
				
				System.out.print("The max number in the array is :" + max);
			break;
					
				
				}
	}
}			
	


	

