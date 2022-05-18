package EmployeeDemo;

public class ShiftSupervisor extends Employee {
	private int salary;
	private int bonus;
	
	public ShiftSupervisor(String a, String b, String c, int d, int e) {
		super(a, b, c);
		salary = d;
		bonus = e;
	}
	
	public ShiftSupervisor() {
		super();
		salary = 0;
		bonus = 0;
	}
	
	public void setSalary(int d) {
		salary = d;
	}
	
	public void setBonus(int e) {
		bonus = e;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public int getBonus() {
		return bonus;
	}
}
