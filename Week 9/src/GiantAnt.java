public class GiantAnt extends Monster{
	boolean venom;
	boolean wings;
	
	public GiantAnt(String name, String type, int hp, int atk, double atkSpd, int def, boolean venom, boolean wings) {
		super(name, type, hp, atk, atkSpd, def);
		this.venom = venom;
		this.wings = wings;
		
		if(this.venom) {
			this.atk *= 1.25;
		}
		
		if(this.wings) {
			this.atkSpd *= 2;
		}
	}
	
	public boolean isVenom() {
		return venom;
	}
	
	public void setVenomt(boolean venom) {
		this.venom = venom;
		if(venom) {
			atk *= 1.25;
		}
	}
	
	public boolean isWings() {
		return wings;
	}
	
	public void setWings(boolean wings) {
		this.wings = wings;
		if(wings) {
			atkSpd *= 2;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\n\tVenemous:\t " + (this.venom ? "Yes" : "No") +
				"\n\tWinged:\t\t " + (this.wings ? "Yes" : "No");
	}
}
