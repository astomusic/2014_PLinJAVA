package hw3;

public class Player {
	private GameLevel gameLevel;
	
	public Player() {
		this.gameLevel = LevelOne.getInstance();
	}
	
	public void upgradeLevel(GameLevel gameLevel) {
		this.gameLevel = gameLevel;
	}
	
	public String getGameLevel() {
		return gameLevel.getLevel();
	}
	
	public void attack() {
		gameLevel.play();
	}
}
