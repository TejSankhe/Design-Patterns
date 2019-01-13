package main;

/**
 * 
 * @author Raj Sankhe
 *
 */
public class Main {

	public static void main(String[] args) {
		DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
	    dragonSlayer.goToBattle();
	    dragonSlayer.changeStrategy(new ProjectileStrategy());
	    dragonSlayer.goToBattle();
	    dragonSlayer.changeStrategy(new SpellStrategy());
	    dragonSlayer.goToBattle();
	}

}
