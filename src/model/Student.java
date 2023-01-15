package model;

import java.util.*;

public class Student {
	String name;
	Map<String, Boolean> attendance = new HashMap<>(); //Журнал посещаемости

	public Student(String name) {
		this.name = name;
	}

	public void setAttendance(String date, Boolean attendance) {
		this.attendance.put(date, attendance); //Заполняем журнал посещений
	}

	public String getName() {
		return name;
	}

	public Collection<Boolean> getAttendance() {
		return this.attendance.values(); //Передаем в контроллер коллекцию посещаемости для подсчета процента посещений
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", attendance=" + attendance +
				'}' + "\n";
	}
}
