package Java_Hackathon;

import java.util.Scanner;

//Write a program for binary search. 
//And 5 i/p has to take from user as binary elements.
public class Q25 {
	public static void  binary(int low,int high,int key,int[]a) {
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(a[mid]==key) {
				System.out.println("The element is present in the list");
				break;
				
			}
			else if (a[mid]>key) 
				high=mid-1;
				else if (a[mid]<key)
					low=mid+1;
			}
		if (low>high)
			System.out.println("The element is not present int the list");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=0; int key =0;
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of the array");
n =s.nextInt();
int[]a = new int[n];
System.out.println("Enter the elements of the array in ascending order");
for(int i=0;i<n;i++) {
	a[i]=s.nextInt();
	}
System.out.println("Enter the key");
key = s.nextInt();
	binary(0,n-1,key,a);
}

	}



