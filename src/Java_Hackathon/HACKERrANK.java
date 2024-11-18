package Java_Hackathon;

import java.util.Scanner;

public class HACKERrANK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum of the length of the string
		//compare two string lexicographically and print 
		//Capitalize the first letter of the words in the string
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
     

         int lenA= A.length();
        int lenB = B.length();
        int sum = lenA + lenB;
        System.out.println(sum);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
       String newA = A.replace(A.charAt(0), A.toUpperCase().charAt(0));
    String newB = B.replace(B.charAt(0), B.toUpperCase().charAt(0));
        System.out.println(newA + " " + newB);
        }
    

		
		
	}


