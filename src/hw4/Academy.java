package hw4;

import java.util.HashSet;

public class Academy {
	private HashSet<Student> students = new HashSet<Student>();
	
	public void addStudent(Student student){
		students.add(student);
	}
	
	public HashSet<Student> getStudents() {
		return students;
	}
}
