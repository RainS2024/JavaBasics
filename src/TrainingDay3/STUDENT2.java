package TrainingDay3;
//Exercise Prb 2 
public class STUDENT2 {
	String name;
	int rollnum;
//Parameterized Construction

public STUDENT2 (String Name,int Rollnum){
	name = Name;        //Local Variable
	rollnum= Rollnum;
	}

public void display() {
	
	System.out.println(name + " " + rollnum);}




@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return this.name.length() % 10;
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	
	 if (this == obj) {
	      return true;
	    }

	    if (obj == null || this.getClass() != obj.getClass()) {
	      return false;
	    }

	    STUDENT2 STU = (STUDENT2) obj;

	    return this.name.equals(STU.name) && this.rollnum == STU.rollnum;
	  }		


@Override
public String toString() {
	// TODO Auto-generated method stub
	return name + " " + rollnum ;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
STUDENT2 S1= new STUDENT2 ("Sam",22);
STUDENT2 S2 = new STUDENT2 ("John",23);//error message comes in displaying Phn Number
S1.display();
S2.display();
	}

}
