package Assignment;
// Prob - Find an element in an array of elements
public class findinarray {
public static int linesearch (int []a,int Key) {
for(int i=0;i< a.length;i++) {
	if (a[i]== Key) {
		return i;
	}
}
return -1;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {10,15,20,25,30,35,40,45,50};
		int Key = 45;
	
	System.out.print(Key + " is found at index " + linesearch (a,Key));
	
}

	}


