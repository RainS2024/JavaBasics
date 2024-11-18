package Practice;
import java.util.Scanner;
public class oddevenarray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
Scanner s= new Scanner(System.in);
System.out.println("Enter the size of the array");
n = s.nextInt();
int [] a= new int [n];
System.out.println("Enter the array element");
for (int i=0;i<n;i++) {
	a[i]= s.nextInt();
}
System.out.println("The array of even number is ");
for(int i=0;i<a.length;i++) {
	if (a[i]%2==0)		
		System.out.print(a[i] + ",");
}


	
	
}
	}

