package Engineering;

public class Mech extends Engineering {
	public void mech() {
		System.out.println("Mech");
	}
	public static void main(String[] args) {
		Mech obj = new Mech();
		obj.univ();
		obj.eng();
		obj.mech();
	
	}

}
