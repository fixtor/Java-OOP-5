import model.Student;
import model.StudentGroup;
import presenter.AttendanceService;
import view.AttendanceView;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		//********************************************************************************************
		List<Student> students = new ArrayList<>();

		Student studentIvan = new Student("Ivan");                  //Имитирует чтение из файла
		studentIvan.setAttendance("2022-01-02", true);      //.......
		studentIvan.setAttendance("2022-01-03", false);

		Student studentMaria = new Student("Maria");
		studentMaria.setAttendance("2022-02-02", true);
		studentMaria.setAttendance("2022-02-03", true);
		studentMaria.setAttendance("2022-02-04", true);

		Student studentSveta = new Student("Sveta");
		studentSveta.setAttendance("2022-03-02", false);
		studentSveta.setAttendance("2022-03-03", false);
		studentSveta.setAttendance("2022-03-04", true);

		Student studentKolya = new Student("Kolya");
		studentKolya.setAttendance("2022-03-02", true);
		studentKolya.setAttendance("2022-03-03", true);
		studentKolya.setAttendance("2022-03-06", false);
		studentKolya.setAttendance("2022-03-08", true);

		students.add(studentIvan);
		students.add(studentMaria);
		students.add(studentSveta);
		students.add(studentKolya); //.... До сюда.
		StudentGroup studentGroup = new StudentGroup(students);
		//***************************************************************************

		//Модуль выполнения
		AttendanceView attendanceView = new AttendanceView(new AttendanceService(studentGroup));
		attendanceView.controlView();
	}
}