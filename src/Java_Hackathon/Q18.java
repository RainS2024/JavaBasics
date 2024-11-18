package Java_Hackathon;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//Q18) WJP to display duplicate character in string
public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String");
		String sent = s.nextLine();
		char[]sent1=sent.toCharArray();
		for(char c:sent1) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
	  Set<Entry<Character,Integer>> mapob =map.entrySet();
	  Iterator<Entry<Character,Integer>> it=mapob.iterator();
	  while(it.hasNext()) {
		 Entry<Character,Integer>eob =it.next();
		 //System.out.println(eob.getKey()+ "-"+eob.getValue()); //prints the complete list of characters
	  	 if(eob.getValue()==2) {
		 System.out.println(eob.getKey()+ ":" + eob.getValue());
		 }
		 }
	  }
}
		
		/*for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()==2) {
				System.out.println(entry.getKey()+ ":" + entry.getValue());
			}
		}*/
	
	


