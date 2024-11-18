package TrainingDay4;

public class ExArray1 {
//One Dimensional Array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Array A:Numbers");
int a[]= {1,5,10,3,4,2,8,7,6,9};
System.out.println("Before sorting :");
for (int i=0;i<a.length;i++) {
System.out.print(a[i]+ ",");}
System.out.println();
System.out.println();


 
System.out.println("Array B:Names");
System.out.println("Before sorting");
String Name[]= {"Navya","Madhu","Siya","Gogo","Anandi"};
	for(int i=0;i< Name.length;i++ )
System.out.print(Name[i]+ ",");
System.out.println();	
System.out.println();
	
System.out.println("Array C: Alphabets");
System.out.println("Before sorting");
char Alphabets[]= {'A','C','E','Z' ,'J'};
for (int i=0;i<Alphabets.length;i++)
	System.out.print(Alphabets[i] +",");

//Two Dimensional Arrays
System.out.print("\n" + "\n" + "2D Array:Numbers" + "\n");
int R1[][] = {{1,2,3},{1,2,3}};

for (int i=0;i<2;i++) {
	for(int j=0;j<3;j++)
		System.out.print(R1[i][j]+ " ");
	System.out.println();}
System.out.println();

String Colors [][] = {{"Red","Blue","Green"},{"Blue","Green","Red"},{"Yellow","Red","Purple"}};
System.out.print("2D Array: Colors" + "\n");

for (int i=0;i<3;i++) {
	for(int j=0;j<3;j++)
		System.out.print(Colors[i][j] +" ");
	System.out.println();
}
System.out.println();

}
	

}
