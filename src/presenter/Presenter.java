package presenter;

import java.util.Map;

public interface Presenter {
	public void printAllAttendance();
	public void printAllInLowSorted(Map<String, Double> map);
	public void printAllNegativeAttendance(Map<String, Double> map);
}
