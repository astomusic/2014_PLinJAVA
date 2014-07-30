package hw4_1;

public class StrategyForMinor implements Strategy{

	@Override
	public String calculateScore(int score) {
		if(score >= 90) {
			return "A";
		} else if (score >= 80) {
			return "B";
		} else if (score >= 70) {
			return "C";
		} else if (score >= 55) {
			return "D";
		}  else {
			return "F";
		}
	}

}
