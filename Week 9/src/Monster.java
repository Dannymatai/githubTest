
public class Monster {
	String name; 
	String type;
	int hp;
	int atk;
	double atkSpd;
	int def;
	
	public Monster(String name, String type, int hp, int atk, double atkSpd, int def) {
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.atk = atk;
		this.atkSpd = atkSpd;
		this.def = def;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	public double getAtkSpd() {
		return atkSpd;
	}
	
	public void setAtkSpd(double atkSpd) {
		this.atkSpd = atkSpd;
	}
	
	public int getDef() {
		return def;
	}
	
	public void setDef(int def) {
		this.def = def;
	}
	
	public double getDps() {
		double dps = atk * atkSpd;
		return dps;
	}
	

	public String toString() {
		return "\n------------------------------------\nMonster\n------------------------------------\n\tName:\t\t " + name +
				"\n\tType:\t\t " + type + "\n\tHealth Points:\t " + hp +
				"\n\tAttack Damage:\t " + atk + "\n\tAttack Speed:\t " + atkSpd +
				"\n\tDefense:\t " + def + "\n\tDPS:\t\t " + getDps();
	}
}
