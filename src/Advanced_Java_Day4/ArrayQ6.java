package Advanced_Java_Day4;

import java.util.Scanner;

import HackathonAssignment.Q30;
//https://www.youtube.com/watch?v=LgG2Km9GvJw
//6. find the longest palindrome in the given string 
public class ArrayQ6 {
	public String longestPalindrome(String input) {
		if (input==null||input.length()<1){
			return "";}
		if (input.length()==1) {
			return input;
		}
		int start=0;
		int substrLen=0;
		for(int i=0;i<input.length();i++) {
			int Length1 = expandaroundcenter(input,i,i);
			int Length2 = expandaroundcenter(input,i,i+1);
			int Length=Math.max(Length1,Length2);
			if(Length>substrLen) {
				start=i-(Length-1)/2;
				substrLen=Length;
			}
		}
		return input.substring(start,start+substrLen);
		}
	
	
private int expandaroundcenter(String input,int left,int right) {
	while(left>=0 && right<input.length()&& input.charAt(left)==input.charAt(right)) {
		left--;
		right++;
	
	}
	return right-left-1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQ6 pal = new ArrayQ6();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string");
		String sent = s.nextLine();
		System.out.println (pal.longestPalindrome(sent));
	}

}
