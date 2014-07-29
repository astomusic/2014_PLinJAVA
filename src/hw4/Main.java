package hw4;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Academy next = new Academy();
		
		next.addStudent(new Student("이승기", "141213", "math", 95, 20));
		next.addStudent(new Student("김수현", "141518", "eng", 90, 100));
		next.addStudent(new Student("주원", "141230", "math", 76, 60));
		next.addStudent(new Student("김우빈", "141255", "math", 85, 89));
		next.addStudent(new Student("이민호", "141590", "eng", 90, 95));
		
		Iterator<Student> i = next.getStudents().iterator();
		
		Strategy forMath = new StrategyForMath();
		Strategy forEng = new StrategyForEng();
		
		while(i.hasNext()){
			Student student = i.next();
			if(student.getMajor().equals("math")) {
				forMath.calculateScore(student);
			} else if(student.getMajor().equals("eng")) {
				forEng.calculateScore(student);
			}
			System.out.println(student);
		}

	}

}
