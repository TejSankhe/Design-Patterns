package main;

public class MeleeStrategy implements DragonSlayingStrategy {

	@Override
	public void execute() {
		System.out.println("Executed Melee Strategy");
	}

}
