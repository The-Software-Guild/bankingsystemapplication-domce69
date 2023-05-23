
public class SavingsAccount extends Account {
	
	private boolean salaryAccount;
	private double minBalance;
	
	public SavingsAccount(boolean salaryAccount, double minBalance) {
		super();
		this.salaryAccount = salaryAccount;
		this.minBalance = minBalance;
	}

	public boolean isSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(boolean salaryAccount) {
		this.salaryAccount = salaryAccount;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	@Override
	public void calculateInterest() {
		
		double interest = getBalance() * 0.04;
		double newBal = getBalance() + interest;
		setInterestEarned(getInterestEarned() + interest);
		setBalance(newBal);
		
		System.out.println("Total interest earned: " + interest + "\nNew Balance: " + newBal);
	}
	
	@Override
	public String toString() {
		return "\n\nSavingsAccount \nSalary Account?: " + salaryAccount + "\nMinimum Balance: " + minBalance;
	}
	
	
}
