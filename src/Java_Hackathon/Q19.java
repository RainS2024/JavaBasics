package Java_Hackathon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Q19. WJP to display number of occurrence of all character
public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter the String");
String sent = s.nextLine();
ArrayList<Character>List=new ArrayList();
for(int i=0;i<sent.length();i++) {
	List.add(sent.charAt(i));
}
System.out.print(List);
System.out.println();

HashMap<Character,Integer>hm= new HashMap<>();
for(int i=0;i<sent.length();i++) {
	hm.putIfAbsent(List.get(i),Collections.frequency(List,List.get(i)));
}
	for(Map.Entry<Character, Integer>e:hm.entrySet()) {
		System.out.println("The Charater is: "+ e.getKey()+ " Its count is :  "+ e.getValue());
	}
	s.close();
	}

}
