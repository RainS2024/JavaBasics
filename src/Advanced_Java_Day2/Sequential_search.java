package Advanced_Java_Day2;

public class Sequential_search {
//linear search
public static int linesearch(int[]a,int key){
	for (int i=0;i<a.length;i++) {
		if (a[i]==key) {
			return i;
		}	
			
		}
	return -1;
	}

//Sequential search
public static void sequential(int low,int high,int key,int[]a) {
	for(int i=low;i<high;i++) {
		if(a[i]==key) {
			System.out.println("The element is present at index : " + i);
			break;
		}
		if (i>high) {
			System.out.println("The element is not present");
		}
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a []= {3,4,5,2,1};
int key = 5;
System.out.println("The key element of the array is at index : "+ linesearch (a,5));
sequential(0,5,5,a);
	}

}
