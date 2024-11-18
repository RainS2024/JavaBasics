package Advanced_Java_Day4;

public class Seaanimals extends Animals{
String location;

public void location() {
	System.out.println(this.Name + "is sleeping at " + this.location);
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Seaanimals Animal1 = new Seaanimals();
Animal1.Name = "Seal";
Animal1.Eat="Fish";
Animal1.location= "Ocean";
Animal1.eating();
Animal1.location();

	}

}
