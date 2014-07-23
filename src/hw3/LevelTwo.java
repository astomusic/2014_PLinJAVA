package hw3;

public class LevelTwo extends GameLevel {
	private static LevelTwo instance = new LevelTwo();
	
	private LevelTwo() {
		this.setLevel("LEVEL 2");
	}
	
	public static LevelTwo getInstance(){
		if(instance == null){
			instance = new LevelTwo();
		}
		return instance;
	}
	
	@Override
	public String simpleAttack() {
		return "hit!";
	}

	@Override
	public String turnAttack() {
		return "heavy hit!!";
	}

	@Override
	public String flyingAttack() {
		return "-";
	}
}
