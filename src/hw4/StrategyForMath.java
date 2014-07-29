package hw4;

import java.util.Map.Entry;

public class StrategyForMath implements Strategy {

	@Override
	public void calculateScore(Student student) {
		int math = student.getMath();
		int eng = student.getEng();

		String key;
		int value;

		for (Entry<String, Integer> entry : majorStrategy.entrySet()) {
			key = entry.getKey();
			value = entry.getValue();
			if (math >= value) {
				student.setMathScore(key);
				break;
			}
		}

		for (Entry<String, Integer> entry : minorStrategy.entrySet()) {
			key = entry.getKey();
			value = entry.getValue();
			if (eng >= value) {
				student.setEngScore(key);
				break;
			}
		}
	}
}
