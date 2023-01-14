
public class Warrior extends Character {
public Warrior() {
	hp = 150;
	ressource = 0;
}
@Override
int ability1() {
	System.out.println("Quickstrike used!");
	int dmg = 5;
	setRessource(ressource + 20); 
	return dmg;
}
@Override
int ability2() {
	System.out.println("Decimate used!");
	int dmg = 0;
	if(getRessource()<40) {
	dmg = 0;
	System.out.println("Failure, not enough rage!(40)");
	}else {
	dmg = 10;
	setRessource(ressource-40);
	}
	return dmg;
	
}
@Override
void ability3() {
	System.out.println("You went berserk!");
	setRessource(ressource+50); 
	setHp(hp+20);	
	
}
@Override
int ability4() {
	System.out.println("Execute");
	int dmg = 0;
	if(getRessource()<80) {
	dmg = 0;
	System.out.println("Failure, not enough rage!(80)");
	}else {
	dmg = 60;
	setRessource(ressource-60);
	}
	
	return dmg;
	
}



	

}
