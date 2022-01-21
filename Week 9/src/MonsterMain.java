
public class MonsterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster m1 = new Monster("Red Dragon", "Dragon", 2500, 100, 1.0, 200);
		System.out.print(m1.toString());
		
		Vampire m2 = new Vampire("Vampire", "Undead", 4000, 150, 2.0, 200, true, true);
		System.out.print(m2.toString());
		
		GiantAnt m3 = new GiantAnt("GiantAnt", "Insect", 2000, 200, 3.0, 50, true, true);
		System.out.print(m3.toString());
	}

}


