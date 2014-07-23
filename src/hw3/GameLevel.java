package hw3;

public abstract class GameLevel {
	private String level;
	public abstract String simpleAttack();
	public abstract String turnAttack();
	public abstract String flyingAttack();
	
	public final void play() {
		System.out.println("------------" + this.level + "------------");
		System.out.println("This is Simple Attack : " + simpleAttack());
		System.out.println("This is Turn Attack : " + turnAttack());
		System.out.println("This is Flying Attack : " + flyingAttack());
	}
	
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
}
