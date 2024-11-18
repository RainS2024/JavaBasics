package Advanced_Java_Day3;

public class capitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word = "i am learning java";
System.out.println("Before Capitalization : " +  word);
		//2nd method https://www.youtube.com/watch?v=xz8j1esbOAQ (very good explanation)
String Sentence = "";
		String []array = word.split(" ");
		for (int i=0;i<array.length;i++) {
			char c = array[i].charAt(0);
		 //System.out.println (array[i]);
		 //System.out.println (c);
			String c1 = String.valueOf(c).toUpperCase();
			String sub = array[i].substring(1);
			//System.out.println (c1);
			Sentence = Sentence + c1 + sub + " " ;
			
			
		}
		
		System.out.print( "After capitalization:  " + Sentence.trim());
	}

}
