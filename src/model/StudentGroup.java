package model;

import java.util.List;

public class StudentGroup {

	private List<Student> students;

	public StudentGroup(List<Student> students) {
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

	@Override
	public String toString() {
		return "StudentGroup{" +
				"students=" + students +
				'}';
	}
}
