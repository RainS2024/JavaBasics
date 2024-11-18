package Advanced_Java_Day4;
//print only even numbers in the given array
import java.util.Scanner;

public class ArrayQ4 {

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
			System.out.println("The even number array is :");
			for(int i=0;i<n;i++) {
				if(num[i]%2==0) {
					System.out.print(num[i] +",");
				}
	}

}
}
