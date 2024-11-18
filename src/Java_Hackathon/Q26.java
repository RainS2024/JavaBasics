package Java_Hackathon;
//Q26 ) WJP to merge two sorted array.(Do not use third array)		
//array1[10] = 1,2,4,6,9,10		
//array2[4] =  3, 5,7,8		
//After merge :  array1[10] = 1,2,3,4,5,6,7,8,9,10
public class Q26 {

public void merge(int[]A,int[]B,int size_A,int size_B) {
	int total_size= size_A + size_B;
	int point_A= size_A-1;
	int point_B=size_B-1;
	for(int i=total_size-1;i>=0;i--) {
		if(point_A>=0 && point_B>=0)
		{
			if(A[point_A]>=B[point_B])
{
	A[i]=A[point_A--];
}
else
{
	A[i]=B[point_B--];
}
		}
		else if (point_B>=0)
		{
			A[i]=B[point_B--];
		}
		else
		{
			break;
		}
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]Array1= {1,2,4,6,9,10,0,0,0,0};
int[]Array2= {3,5,7,8};
Q26 m= new Q26();
m.merge(Array1, Array2, 6, 4);
for(int i=0;i<10;i++)
{
	System.out.print(Array1[i] + ",");
}

	}
	

}
