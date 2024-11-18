package Advanced_Java_Day7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Count {
//Given a string, write a Java program to find the most common word in the string 
	
	public static void mostcommon(String Usrinput) {
		HashMap<String,Integer> wordset=new HashMap<String,Integer>();	
		String word [] = Usrinput.split(" ");
	    
		for(String wrd:word) {
		if(wordset.containsKey(wrd)) {
			wordset.put(wrd, wordset.get(wrd)+1);
		}
		else {
			wordset.put(wrd,1);
		}
	    		    
	}
		System.out.println("The Total Number of characters in the String--> " + Usrinput + " : " + wordset);
		Set<Entry<String,Integer>> ob =wordset.entrySet();
		Iterator<Entry<String,Integer>>it= ob.iterator();
		while(it.hasNext()) {
			Entry<String,Integer>eob=it.next();
			int cnt = eob.getValue();
			if(cnt>=2) {
				System.out.println(eob.getKey()+ " " + eob.getValue());
			}
		}
	
	}
	
	public static void countwords(String UsrInput) {
		int total=1;
		for (int i=0;i<UsrInput.length();i++) {
			if ((UsrInput.charAt(i)== ' ') && (UsrInput.charAt(i+1)!= ' ')) {
				total++;
			}						
		    
	}
		System.out.println("The count of word in the string is : " + total);
		
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String or Q to Quit");
	String UsrInput = s.nextLine();
	while(!UsrInput.equals("Q")) {
		mostcommon(UsrInput);
		countwords(UsrInput);
		System.out.println("Enter the String or Q to Quit");
		UsrInput = s.nextLine();
		
	}
			
		
	}
}

