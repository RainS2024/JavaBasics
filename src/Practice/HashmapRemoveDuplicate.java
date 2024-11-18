package Practice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class HashmapRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the string ");
		
		//removing duplicate character from map.
		String word = scan.next();
		char[] newwrd=word.toCharArray();
		
		
		HashMap<Character,Integer>map = new HashMap<Character,Integer>();
		for(char c:newwrd) {
			if(!map.containsKey(c)) {
				//map.remove(s);
				map.put(c,1 );
				//map.put(s,map.get(s)+1);
			}
			else {
				map.put(c, 1);
			}
		
			
			String sentence = scan.nextLine();
			//StringBuilder newsent = new StringBuilder(sentence);
			//newsent.reverse();
			//System.out.println(newsent);
			
			String []newsent = sentence.split(" ");
			for(String s:newsent) {
			System.out.print(s);}	
			
			HashMap<String,Integer>map1 = new HashMap<String,Integer>();	
			for(String s:newsent) {
		if(!map1.containsKey(s)) {
			map1.put(s,1 );
			
		}
		else {
			map1.put(s, 1);
		}
		
		
		
		 System.out.println("The string and their values are " + map);
		

	}

		}
		}
}

	
	
	
	

