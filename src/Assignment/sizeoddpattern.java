package Assignment;
import java.util.Scanner;
public class sizeoddpattern {
	//user input on size and print odd number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner S = new Scanner(System.in);

System.out.println("Enter the size");
int size = S.nextInt();
System.out.println("-------------------");
System.out.println("The odd number pattern is");
for (int i=0;i<=size;i++) {
	System.out.print((i=i+1) + " ");
	
}

// user input on size and print even number

System.out.println();
System.out.println();
Scanner E = new Scanner(System.in);

System.out.println("Enter the size");
int size2 = S.nextInt();
System.out.println("-------------------");
System.out.println("The even number pattern is");
for (int i=1;i<=size2;i++) {
	System.out.print((i=i+1) + " ");
	}

	}
}
