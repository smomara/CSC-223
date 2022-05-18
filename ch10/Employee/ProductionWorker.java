package Employee;

public class ProductionWorker extends Employee {
	private int shift;
	private double payRate;
	
	public ProductionWorker(String a, String b, String c, int d, double e) {
		super(a, b, c);
		shift = d;
		payRate = e;
	}
	
	public ProductionWorker() {
		super();
		shift = 1;
		payRate = 0;
	}
	
	public void setShift(int d) {
		shift = d;
	}
	
	public void setPayRate(double e) {
		payRate = e;
	}
	
	public int getShift() {
		return shift;
	}
	
	public double getPayRate() {
		return payRate;
	}

}
