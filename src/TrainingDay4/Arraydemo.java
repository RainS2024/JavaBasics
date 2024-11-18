package TrainingDay4;

public class Arraydemo {
	public static int Linesearch(int a[],int key) {
	for (int i=0;i<a.length;i++) {
		if (a[i]==key) {
			return i;
		}
	}
	return -1;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[10];
System.out.println("Elements of Array wit default values");
for (int j=0;j<10;j++) {
	System.out.print(a[j]+ ",");
}
System.out.println();

for (int i=0;i<10;i++) {
	a[i]= i;
	
 System.out.print(a[i] + ",");

}
int []b = {2,4,6,8,10};
int key=15;
System.out.println();
System.out.print(key + " is found at = "+ Linesearch(b,key));

 

//for(int j=0;j<10;j++) {
	//System.out.println("a[" + i + "]=" + a[i]);// I didnot do the nested for loop 
	//still I got the same array in result by taking only i for (loop) then why nested loop is needed?
	
}


	}
	


