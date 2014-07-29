package hw4;

import java.util.LinkedHashMap;

public interface Strategy {
	public static final LinkedHashMap<String, Integer> majorStrategy = new LinkedHashMap<String, Integer>() {
		private static final long serialVersionUID = -4236106244347225638L;
		{
			put("S", 95);
			put("A", 90);
			put("B", 80);
			put("C", 70);
			put("D", 60);
			put("F", 0);
		}
	};
	
	public static final LinkedHashMap<String, Integer> minorStrategy = new LinkedHashMap<String, Integer>() {
		private static final long serialVersionUID = -7957555604695481207L;
		{
			put("A", 90);
			put("B", 80);
			put("C", 70);
			put("D", 55);
			put("F", 0);
		}
	};
	
	public void calculateScore(Student student);
	
}
