import java.util.ArrayList;
import java.util.Scanner;

public class Fight {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
	
		Character player1 = new Character();
		Character player2 = new Character();
		ArrayList<String> terrain = new ArrayList<>();
		terrain.add("Mountains");
		terrain.add("Plains");
		terrain.add("Desert");
		terrain.add("Arena");

		while (true) {
			System.out.println("Player 1, choose your character:");
			System.out.println("Press 1 for Warrior or 2 for Mage,3 to quit");
			String select = scan.next();
			if (select.equals("1")) {
				System.out.println("Warrior stats and abilities:" + "\n" + "HP:150" + "\n" + "RESSOURCE:RAGE");
				System.out.println("1.Ability:Quickstrike-5 dmg/primary rage generator");
				System.out.println("2.Ability:Decimate-40 dmg, rage spender");
				System.out.println("3.Ability:Berserk- small hp regen + big rage generator");
				System.out.println("4.Ability:Execute - Powerful Finisher");
				System.out.println("Press 1 to continue or type 2 to return");
				if (scan.next().equals("1")) {
					player1 = new Warrior();
					System.out.println("You have chosen the Warrior Class.");
					break;

				}
			} else if (select.equals("2")) {
				System.out.println("Mage stats and abilities:" + "\n" + "HP:100" + "\n" + "RESSOURCE:MANA");
				System.out.println("1.Ability:Freeze-20 dmg/40 mana");
				System.out.println("2.Ability:Fireball-40 dmg/80 mana");
				System.out.println("3.Ability:Mana potion- +60 mana, 1 use only");
				System.out.println("4.Ability:Arcane Power - Expensive but hard hitting spell or mana regen");
				System.out.println("Press 1 to continue or type 2 to return");
				if (scan.next().equals("1")) {
					player1 = new Mage();
					System.out.println("You have chosen the Mage Class.");
					break;

				}

			} else if (select.equals("3")) {
				System.out.println("Goodbye!");
				break;

			}

		}
		while (true) {
			System.out.println("Player 2, choose your character:");
			System.out.println("Press 1 for Warrior or 2 for Mage,3 to quit");
			String select = scan.next();
			if (select.equals("1")) {
				System.out.println("Warrior stats and abilities:" + "\n" + "HP:150" + "\n" + "RESSOURCE:RAGE");
				System.out.println("1.Ability:Quickstrike-5 dmg/primary rage generator");
				System.out.println("2.Ability:Decimate-40 dmg, rage spender");
				System.out.println("3.Ability:Berserk- small hp regen + big rage generator");
				System.out.println("4.Ability:Execute - Powerful Finisher");
				System.out.println("Press 1 to continue or type 2 to return");
				if (scan.next().equals("1")) {
					player2 = new Warrior();
					System.out.println("You have chosen the Warrior Class.");
					break;

				}
			} else if (select.equals("2")) {
				System.out.println("Mage stats and abilities:" + "\n" + "HP:100" + "\n" + "RESSOURCE:MANA");
				System.out.println("1.Ability:Freeze-20 dmg/40 mana");
				System.out.println("2.Ability:Fireball-40 dmg/80 mana");
				System.out.println("3.Ability:Mana potion- +60 mana");
				System.out.println("4.Ability:Arcane Power - Expensive but hard hitting spell or mana regen");
				System.out.println("Press 1 to continue or type 2 to return");
				if (scan.next().equals("1")) {
					player2 = new Mage();
					System.out.println("You have chosen the Mage Class.");
					break;

				}

			} else if (select.equals("3")) {
				System.out.println("Goodbye!");
				System.exit(0);
				
			}

		}
		
		if(terrain.get((int)(Math.random()*4)).equals("Mountains")){
			System.out.println("Fight is set in  Mountains/+50hp");
			player1.setHp(player1.getHp()+50);
			player2.setHp(player2.getHp()+50);
		}
		else if(terrain.get((int)(Math.random()*4)).equals("Plains")){
			System.out.println("Fight is set in Plains/+20hp");
			player1.setHp(player1.getHp()+20);
			player2.setHp(player2.getHp()+20);
		}
		else if(terrain.get((int)(Math.random()*4)).equals("Desert")){
			System.out.println("Fight is set in Plains/-20hp");
			player1.setHp(player1.getHp()-20);
			player2.setHp(player2.getHp()-20);
		}
		else if(terrain.get((int)(Math.random()*4)).equals("Arena")){
			System.out.println("Fight is set in the Arena/no changes");
		
		}
		System.out.println("!!FIGHT!!");
		while(true) {
			System.out.println("Player1 choose an ability to use!");
			String select1 = scan.next();
			if(select1.equals("1")) {
				player2.setHp(player2.getHp()-player1.ability1());
				System.out.println("Player 1 ressource:"+player1.getRessource());
				System.out.println("Player 1 HP:"+player1.getHp());
				System.out.println("Player 2 HP:"+player2.getHp());
			}else if(select1.equals("2")) {
				player2.setHp(player2.getHp()-player1.ability2());
				System.out.println("Player 1 ressource:"+player1.getRessource());
				System.out.println("Player 1 HP:"+player1.getHp());
				System.out.println("Player 2 HP:"+player2.getHp());
			}else if(select1.equals("3")) {
				player1.ability3();
				System.out.println("Player 1 ressource:"+player1.getRessource());
				System.out.println("Player 1 HP:"+player1.getHp());
				System.out.println("Player 2 HP:"+player2.getHp());
			}else if(select1.equals("4")) {
				player2.setHp(player2.getHp()-player1.ability4());
				System.out.println("Player 1 ressource:"+player1.getRessource());
				System.out.println("Player 1 HP:"+player1.getHp());
				System.out.println("Player 2 HP:"+player2.getHp());
			} 
			if(player2.getHp()<=0) {
				System.out.println("Player1 is victorious!");
				break;
			}
			System.out.println("Player2 choose an ability to use!");
			String select2 = scan.next();
			if(select2.equals("1")) {
				player1.setHp(player1.getHp()-player2.ability1());
				System.out.println("Player 2 ressource:"+player2.getRessource());
				System.out.println("Player 2 HP:"+player2.getHp());
				System.out.println("Player 1 HP:"+player1.getHp());
			}else if(select2.equals("2")) {
				player1.setHp(player1.getHp()-player2.ability2());
				System.out.println("Player 2 ressource:"+player2.getRessource());
				System.out.println("Player 2 HP:"+player2.getHp());
				System.out.println("Player 1 HP:"+player1.getHp());
			}else if(select2.equals("3")) {
				player2.ability3();
				System.out.println("Player 2 ressource:"+player2.getRessource());
				System.out.println("Player 2 HP:"+player2.getHp());
				System.out.println("Player 1 HP:"+player1.getHp());
			}else if(select2.equals("4")) {
				player1.setHp(player1.getHp()-player2.ability4());
				System.out.println("Player 2 ressource:"+player2.getRessource());
				System.out.println("Player 2 HP:"+player2.getHp());
				System.out.println("Player 1 HP:"+player1.getHp());
			
			} 
			if(player1.getHp()==0) {
				System.out.println("Player2 is victorious!");
				break;
			}
		}
		scan.close();
		System.exit(0);
		
		}
	
	
		
		
		

	
}
