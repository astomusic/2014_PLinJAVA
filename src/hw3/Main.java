package hw3;

public class Main {

	public static void main(String[] args) {
		Player player = new Player();
		GameLevel levelTwo = LevelTwo.getInstance();
		GameLevel levelThree = LevelThree.getInstance();
		
		player.attack();
		player.upgradeLevel(levelTwo);
		player.attack();
		player.upgradeLevel(levelThree);
		player.attack();

	}

}
