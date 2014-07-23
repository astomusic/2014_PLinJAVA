package hw3;

public class LevelThree extends GameLevel {
	private static LevelThree instance = new LevelThree();
	
	private LevelThree() {
		this.setLevel("LEVEL 3");
	}
	
	public static LevelThree getInstance(){
		if(instance == null){
			instance = new LevelThree();
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
		return "critical hit!!!";
	}

}
