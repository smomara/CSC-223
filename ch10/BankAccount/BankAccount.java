package BankAccount;

public class BankAccount {
	private double balance;
	private double annualInterestRate;
	private double monthlyServiceCharges;
	private int numDeposits = 0, numWithdrawals = 0;

	public BankAccount() {
		balance = 0;
		annualInterestRate = 0;
		monthlyServiceCharges = 0;
	}
	
	public BankAccount(double bal, double rate, double charges) {
		balance = bal;
		annualInterestRate = rate;
		monthlyServiceCharges = charges;
	}
	
	public void setBalance(double bal) {
		balance = bal;
	}
	
	public void setAnnualInerestRate(double rate) {
		annualInterestRate = rate;
	}
	
	public void setMonthlyServiceCharges(double charges) {
		monthlyServiceCharges = charges;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public double getMonthlyServiceCharges() {
		return monthlyServiceCharges;
	}
	
	public int getNumWithdrawals() {
		return numWithdrawals;
	}
	
	public void deposit(double value) {
		balance += value;
		numDeposits++;
	}
	
	public void withdraw(double value) {
		balance -= value;
		numWithdrawals--;
	}
	
	public void calcInterest() {
		balance += balance * annualInterestRate / 12;
	}
	
	public void monthlyProcess() {
		balance -= monthlyServiceCharges;
		calcInterest();
		numDeposits = 0;
		numWithdrawals = 0;
	}
}
