package presenter;

import model.Student;
import model.StudentGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttendanceService implements Presenter {
	private StudentGroup students;

	public AttendanceService(StudentGroup students) {
		this.students = students;
	}

	public Map<String, Double> getAttendancePercentage() {
		Map<String, Double> percents = new HashMap<>();
		List<PairNamePercent> newList = new ArrayList<>();
		double count = 0.0;
		for (Student item : students.getStudents()) {
			for (Boolean item1 : item.getAttendance()) {
				if (item1) count++;
			}
			newList.add(new PairNamePercent(item.getName(), (count / item.getAttendance().size()) * 100));
			percents.put(item.getName(), (count / item.getAttendance().size()) * 100);
			count = 0.0;
		}
		return percents;
	}

	@Override
	public void printAllAttendance() {
		for (Student student : students.getStudents()) {
			System.out.println(student.getName() + " " + student.getAttendance());
		}
	}

	@Override
	public void printAllInLowSorted(Map<String, Double> map) {
		map.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue().reversed()).forEach(System.out::println);
	}

	@Override
	public void printAllNegativeAttendance(Map<String, Double> map) {

		for(Map.Entry<String, Double> entry: map.entrySet()) {
			PairNamePercent pairNamePercent = new PairNamePercent(entry.getKey(), entry.getValue());
			if (pairNamePercent.getPercentage() < 50){
				System.out.println(pairNamePercent.getName() + " " + pairNamePercent.getPercentage());
			}
		}
	}


	@Override
	public String toString() {
		return "AttendanceService{" +
				"students=" + students +
				'}';
	}
}
