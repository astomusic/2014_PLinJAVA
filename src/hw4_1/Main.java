package hw4_1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("이승기", "141213", "math", 95, 20));
		students.add(new Student("김수현", "141518", "eng", 90, 100));
		students.add(new Student("주원", "141230", "math", 76, 60));
		students.add(new Student("김우빈", "141255", "math", 85, 89));
		students.add( new Student("이민호", "141590", "eng", 90, 95));
		
		Strategy strategy = null; 
		String grade;
		
		for (Student student : students) {
			if(student.getMajor().equals("math")){
				strategy = new StrategyForMajor();
				grade = strategy.calculateScore(student.getMath());
				student.setMathGrade(grade);
				
				strategy = new StrategyForMinor();
				grade = strategy.calculateScore(student.getEng());
				student.setEngGrade(grade);
			} else {
				strategy = new StrategyForMajor();
				grade = strategy.calculateScore(student.getEng());
				student.setEngGrade(grade);
				
				strategy = new StrategyForMinor();
				grade = strategy.calculateScore(student.getMath());
				student.setMathGrade(grade);
			}
			
			System.out.println(student);
		}
	}

}
