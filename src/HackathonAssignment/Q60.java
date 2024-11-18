package HackathonAssignment;
/*Q 60. write an algorithm to reverse first 3 numbers, 
 * then next 3 numbers, then next 3 numbers, the number will be  based on var k. 
 * Array = [3,2,4,7,0,3,1,5,8, 4]     
 *   k=3      
 *    OutPut = [4,2,3,3,0,7,8,5,1,4]
 */



public class Q60 {

public static void reversearray(int []a , int k) {
	int length=a.length;
	//make subarray to reverse,i=0, i=i+k (keeps the size) 
	for(int i= 0;i<length;i=i+k) {
		int start=i;
		int end = Math.min(i+k-1, length-1);//min value helps to not get array out of bound exception
		while(start<=end) {  //reverses the elements
			int temp = a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
			
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Array = {3,2,4,7,0,3,1,5,8,4} ;
		int k=3;
		reversearray(Array,3);
		for (int val:Array) {
			System.out.print(val + ",");
		}
	}

}
