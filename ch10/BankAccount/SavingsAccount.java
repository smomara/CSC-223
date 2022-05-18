package BankAccount;

public class SavingsAccount extends BankAccount {
	public SavingsAccount(double bal, double rate, double charges) {
		super(bal, rate, charges);
	}
	
	public SavingsAccount() {
		super();
	}
	
	public boolean isActive() {
		if(getBalance() >= 25) return true;
		else return false;
	}
	
	@Override
	public void withdraw(double value) {
		if(isActive()) super.withdraw(value);
	}
	
	@Override
	public void monthlyProcess() {
		if(getNumWithdrawals() > 4) setMonthlyServiceCharges(getMonthlyServiceCharges() + getNumWithdrawals() - 4);
		super.monthlyProcess();
	}
}
