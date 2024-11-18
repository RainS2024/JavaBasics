package Assignment;

public class EvenfromArray {
//even numbers from array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a []= {1,2,3,4,5,6,7,8,9,10};

System.out.println("Even numbers in the array is....");
for (int i=0;i<a.length;i++)
{
	if(a[i]%2==0)
		System.out.print(a[i] + ",");
	}
// Finding and printing odd numbers from the array
System.out.println();
System.out.println("Odd numbers in the array is....");
for (int i=0;i<a.length;i++)
{
	if(a[i]%2!=0)
		System.out.print(a[i] + ",");
	}

}
}
