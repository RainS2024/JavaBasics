package Practice;
import java.util.Scanner;
public class Swap_array_evenno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter the size of the Array");
int n = s.nextInt();
int []a= new int [n];
System.out.println("Enter the elements of the array");
for(int i=0;i<a.length;i++) {
	a[i]=s.nextInt();
	
}
System.out.println("The array before sorting the even number is");

for (int i=0;i<a.length;i++) {
	System.out.print(a[i] + ",");
}

System.out.println();
//prgrm to sort the array
	int i=0;
		for (int j=0;j<a.length;j++) {
			if (a[j]%2==0) {
				int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
					
						
			}	
		}
		System.out.println("The array after sorting the even number first is");		
			for (int j=0;j<a.length;j++) {
				System.out.print(a[j] + ",");	
			
	}
	}
	
}

