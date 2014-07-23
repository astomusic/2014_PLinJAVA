package hw3;


public class LevelOne extends GameLevel{
	private static LevelOne instance = new LevelOne();
	
	private LevelOne() {
		this.setLevel("LEVEL 1");
	}
	
	public static LevelOne getInstance(){
		if(instance == null){
			instance = new LevelOne();
		}
		return instance;
	}
	
	@Override
	public String simpleAttack() {
		return "hit!";
	}

	@Override
	public String turnAttack() {
		return "-";
	}

	@Override
	public String flyingAttack() {
		return "-";
	}
}
