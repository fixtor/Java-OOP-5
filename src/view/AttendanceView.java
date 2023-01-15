package view;

import presenter.AttendanceService;
import presenter.PairNamePercent;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendanceView {

	private AttendanceService attendanceService;
	//	private PairNamePercent pairNamePercent;
	private List<AttendanceService> attendanceServices = new ArrayList<>();


	public AttendanceView(AttendanceService attendanceService) {
		this.attendanceService = attendanceService;
	}

	public void viewMenu() {
		System.out.println("Выберете пункт:\n");
	}

	public void viewSortAttend() {
		attendanceService.printAllInLowSorted(attendanceService.getAttendancePercentage());
	}

	public void viewAllAttend() {
		attendanceService.printAllAttendance();
	}

	public void viewNegativeAttend() {
		attendanceService.printAllNegativeAttendance(attendanceService.getAttendancePercentage());
	}

	public void controlView() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите номер:\n");
		int userInput = scanner.nextInt();
		switch (userInput) {
			case 0:
				viewMenu();
			case 1:
				viewAllAttend();
			case 2:
				viewSortAttend();
			case 3:
				viewNegativeAttend();
		}
	}
}


