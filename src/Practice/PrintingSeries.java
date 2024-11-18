package Practice;

public class PrintingSeries {


	public static void main(String[] args) {

//printing the numbers in a series and taking out sum
		
int sum=0;
for(int i=1;i<=100;i++) {
	System.out.print(i + " ");
	sum= sum +i;
	
}

System.out.print("\n" + "The sum of the numbers is = " + sum);	


}
}

