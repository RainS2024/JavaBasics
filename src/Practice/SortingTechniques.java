package Practice;

public class SortingTechniques {
	
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void BubbleSort() {
		int arr []= {2,5,3,1,6};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]) {
					//swap
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		}
	}
		print(arr);
		
}

	public static void SelectionSort() {	
		int arr []= {2,5,3,1,6};
		for(int i=0;i<arr.length-1;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[smallest]>arr[j])
					smallest=j;		
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
	print(arr);
	}
	
	public static void InsertionSort() {	
		int arr []= {2,5,3,1,6};
	for(int i=1;i<arr.length;i++) {
		int current=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>current) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=current;
	}
	print(arr);
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BubbleSort();
		SelectionSort();
		//InsertionSort();
	}

}
