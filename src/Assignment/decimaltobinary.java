package Assignment;
import java.util.Scanner;
public class decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner (System.in);
System.out.println("Enter the number");
int num = s.nextInt();
int Num = num;
long binary = 0;
int remainder,i=1;
while (Num!=0) {
	remainder= Num%2;
	Num/=2;
	binary+=remainder*i;
	i*=10;
}
System.out.println(binary);
	}

}
