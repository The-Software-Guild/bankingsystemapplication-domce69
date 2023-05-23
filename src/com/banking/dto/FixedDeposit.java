
public class FixedDeposit extends Account {
	
	private double minDepositAmount;
	private int tenure;
	
	public FixedDeposit(double minDepositAmount, int tenure) {
		super();
		this.minDepositAmount = minDepositAmount;
		this.tenure = tenure;
	}

	public double getDepositAmount() {
		return minDepositAmount;
	}

	public void setDepositAmount(double minDepositAmount) {
		this.minDepositAmount = minDepositAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
	@Override
	public String toString() {
		return "\n\nFixedDeposit \nMinimum Deposit Amount: " + minDepositAmount + "\nTenure: " + tenure;
	}
	
	
}
