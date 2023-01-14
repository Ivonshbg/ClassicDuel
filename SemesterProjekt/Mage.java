
public class Mage extends Character {
	public Mage() {
		hp = 100;
		ressource = 200;
	}
	@Override
	int ability1() {
		System.out.println("Frostball used!");
		int dmg = 0;
		if(getRessource()<40) {
			System.out.println("Not enough mana!");
			dmg = 0;
		}else {
		dmg = 10;
		setRessource(ressource - 40); 
		}
		return dmg;
	}
	@Override
	int ability2() {
		System.out.println("Fireball used!");
		int dmg = 0;
		if(getRessource()<80) {
		dmg = 0;
		System.out.println("Failure, not enough mana!");
		}else {
		dmg = 30;
		setRessource(ressource-80);
		}
		return dmg;
		
	}
	@Override
	void ability3() {
		System.out.println("You drank a mana potion!");
		setRessource(ressource+100); 
			
		
	}
	@Override
	int ability4() {
		int dmg = 0;
		if(getRessource()<80) {
			System.out.println("You catch the arcane currents!");
			setRessource(ressource+40);
			
		}
		else {
			System.out.println("You unleash arcane power!");
			dmg = 70;
			setRessource(ressource-80);
		}
		return dmg;
		
	}

}
