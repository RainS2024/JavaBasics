package Advanced_Java_Day7;

import java.util.HashSet;
import java.util.Iterator;

import TrainingDay3.STUDENT2;

//https://www.youtube.com/watch?v=X2AjBFZfFCY- explanation on overriding hashcode and equals

public class Hashset_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<STUDENT2> ob =new HashSet<STUDENT2>();
ob.add(new STUDENT2("Mita",23));
ob.add(new STUDENT2("Mita",23));
ob.add(new STUDENT2("Nina",12));
ob.add(new STUDENT2("Gopal",20));
ob.add(new STUDENT2("Shweta",32));

Iterator<STUDENT2> it = ob.iterator();
while(it.hasNext()) {

	System.out.println(it.next());
}
	}

}
