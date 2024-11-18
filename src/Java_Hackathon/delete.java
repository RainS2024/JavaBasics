package Java_Hackathon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the string");
     String S1= s.nextLine();
   
     //printing characters in a string with duplicate value
     
     String S2=S1.replaceAll(" ", "");
     char[] C1=S2.toCharArray();
     int n = C1.length;
     
     HashMap<Character,Integer> map = new HashMap<Character,Integer>();
     for(char c:C1) {
    	 if(map.containsKey(c)) {
    		 map.put(c, map.get(c)+1);
    	 }
    	 else {
    		 map.put(c, 1);
    	 }
     }
     System.out.println("The characters and their values are " + map);
     
    
     Set<Entry<Character,Integer>> entryob= map.entrySet();
     Iterator<Entry<Character,Integer>> itob = entryob.iterator();
     System.out.println("The characters with duplicate values are " );
     while(itob.hasNext()) {
    	Entry<Character,Integer> ob = itob.next();
    	if(ob.getValue()==2) {
    		System.out.println(ob.getKey()+":" +ob.getValue());
    	}
     }
     //printing words in a string with duplicate value 
     
     String[]strArray=S1.split(" ");
     int n1=strArray.length;
     
     HashMap<String,Integer> strmap = new HashMap<String,Integer>();
     for(String str:strArray) {
    	 if(strmap.containsKey(str)) {
    		 strmap.put(str, strmap.get(str)+1);
    	 }
    	 else {
    		 strmap.put(str, 1);
    	 }
     }
     
     System.out.println("The characters and their values are " + strmap);
     
    Set<Entry<String,Integer>> strset=strmap.entrySet();
  Iterator<Entry<String,Integer>> strit  =strset.iterator();
  System.out.println("The words with duplicate values are " );
  while(strit.hasNext()) {
	  Entry<String,Integer>entrystr=strit.next();
	  if(entrystr.getValue()==2) {
		  System.out.println(entrystr.getKey()+ ":"+ entrystr.getValue());
	  }
	  
  }
 
  
  
  
  
}
    
     }