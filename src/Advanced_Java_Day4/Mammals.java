package Advanced_Java_Day4;

public class Mammals extends Animals{
String Baby;

public Mammals() {
	System.out.println("Mammals give birth");
}

public void Babies() {
	System.out.println(this.Name + " babies are called " + this.Baby);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mammals Animal1=new Mammals();
Animal1.Name= "Lion";
Animal1.Eat= "Flesh";
Animal1.Baby= "Cub";
Animal1.eating();
Animal1.Babies();

	}

}
