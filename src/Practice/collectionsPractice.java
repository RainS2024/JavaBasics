package Practice;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;


public class collectionsPractice {

	
//1.store 5 integer value in linked list and sort in ascending order	
public static void lnkdlstexample() {
	
	LinkedList<Integer> lst = new LinkedList<Integer>();
	lst.add(5);
	lst.add(1);
	lst.add(4);
	lst.add(3);
	lst.add(2);
	Iterator<Integer> it = lst.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	Collections.sort(lst);
	
	Iterator<Integer> it1 = lst.iterator();
	System.out.println("----The sorted list is---- ");
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
}
/*
public static void studentexample() {	
	Student A = new Student("Ayan",4.2,320);
	Student B = new Student("Ayan",4.2,320);
	Student C = new Student ("Siya", 3.6,240);
	Student D = new Student ("Rohan", 3.9,329);
	Student E = new Student("Soma",4.0,400);
	
	LinkedList <Student>Students = new LinkedList<Student>();
	Students.add(A);
	Students.add(B);
	Students.add(C);
	Students.add(D);
	Students.add(E);
	//Iterator<Student> it = Students.iterator();
	//while(it.hasNext()) {
	//	System.out.println(it.next());
	//}
	
	HashSet<Student> sortedstudent = new HashSet<Student>();
	sortedstudent.add(A);
	sortedstudent.add(B);
	sortedstudent.add(C);
	sortedstudent.add(D);
	sortedstudent.add(E);
	Iterator<Student> it1 = sortedstudent.iterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//lnkdlstexample();
		//studentexample();
	}

}
