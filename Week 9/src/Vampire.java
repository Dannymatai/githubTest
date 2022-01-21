
public class Vampire extends Monster{
	boolean night;
	boolean starved;
	
	public Vampire(String name, String type, int hp, int atk, double atkSpd, int def, boolean night, boolean starved) {
		super(name, type, hp, atk, atkSpd, def);
		this.night = night;
		this.starved = starved;
		
		if(!this.night) {
			this.def = 0;
		}
		
		if(this.starved) {
			this.hp/=2;
			this.atk*=2;
		}
	}
	
	public boolean isNight() {
		return night;
	}
	
	public void setNight(boolean night) {
		this.night = night;
		if(!night) {
			def = 0;
		}
	}
	
	public boolean isStarved() {
		return starved;
	}
	
	public void setStarved(boolean starved) {
		this.starved = starved;
		if(starved) {
			hp/=2;
			atk*=2;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\n\tDaytime applied: " + (this.night ? "Yes" : "No") +
				"\n\tStarved applied: " + (this.starved ? "Yes" : "No");
	}
}
