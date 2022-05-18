package EmployeeDemo;

public class TeamLeader extends ProductionWorker {
	private int monthlyBonus;
	private int reqTrainingHours, numTrainingHours;
	
	public TeamLeader(String a, String b, String c, int d, double e, int f, int g, int h) {
		super (a, b, c, d, e);
		monthlyBonus = f;
		reqTrainingHours = g;
		numTrainingHours = h;
	}
	
	public TeamLeader() {
		super();
		monthlyBonus = 0;
		reqTrainingHours = 0;
		numTrainingHours = 0;
	}
	
	public void setMonthlyBonus(int f) {
		monthlyBonus = f;
	}
	
	public void setRequiredTrainingHours(int g) {
		reqTrainingHours = g;
	}
	
	public void setNumberTrainingHours(int h) {
		numTrainingHours = h;
	}
	
	public int getMonthlyBonus() {
		return monthlyBonus;
	}
	
	public int getRequiredTrainingHours() {
		return reqTrainingHours;
	}
	
	public int getNumberTrainingHours() {
		return numTrainingHours;
	}
}
