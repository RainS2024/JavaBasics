import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Practice {
	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(",");	
			}
		}
	}
	
	public static void main(String[] args) {
		String sent = "my my name is is Joe";
		String [] sent1 = sent.split(" ");
		
		//count no. of words
		 int no = sent1.length;
		 System.out.println("number of words in the string = " + no);
		
		//duplicate words in a string.
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(String str:sent1) {
			if(map.containsKey(str)) {
				map.put(str,map.get(str)+1);
			}
			else {
				map.put(str,1);
			}
		}
		System.out.println("The duplicate words in the string are");
		Set<Entry<String,Integer>> mapset=map.entrySet();
		Iterator<Entry<String,Integer>> mapit=  mapset.iterator();
		
		while(mapit.hasNext()) {
			Entry<String,Integer> mapentry=mapit.next();
			if(mapentry.getValue()>=2) {
				System.out.println(mapentry .getKey() + ":" + mapentry.getValue());
			}
		}
		
	}

}
