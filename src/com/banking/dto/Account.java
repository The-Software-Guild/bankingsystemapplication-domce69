import java.time.LocalDate;

public abstract class Account {
	
	private long accountNum;
	private static long bsb = 298366;
	private static String bankName = "The National Bank of Thomas";
	private double balance;
	private LocalDate date; // = LocalDate.now();; // DD/MM/YYYY
	private double interestEarned;
	
	public Account() {
		
	}
	
	public Account(long accountNum, double balance, double interestEarned) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
		this.date = LocalDate.now();
		this.interestEarned = interestEarned;
	}
	
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public static long getBsb() {
		return bsb;
	}
	public static void setBsb(long bsb) {
		Account.bsb = bsb;
	}
	public static String getBankName() {
		return bankName;
	}
	public static void setBankName(String bankName) {
		Account.bankName = bankName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getInterestEarned() {
		return interestEarned;
	}
	public void setInterestEarned(double interestEarned) {
		this.interestEarned = interestEarned;
	}
	public void calculateInterest() {}
	@Override
	public String toString() {
		return "\nAccount \nAccount Number: " + accountNum + "\nBalance: " + balance + "\nOpening Date: " + date + "\nInterest Earned"
				+ interestEarned;
	}
	
	
	
}
