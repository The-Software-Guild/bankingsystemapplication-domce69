import java.time.LocalDate;

public class Customer {
	
	private int id;
	private String name;
	private int age;
	private int mobileNum;
	private String passportNum;
	private LocalDate DOB;
	private Account acc;
	
	
	public Customer(int id, String name, int age, int mobileNum, String passportNum, LocalDate dOB, Account acc) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobileNum = mobileNum;
		this.passportNum = passportNum;
		this.DOB = dOB;
		this.acc = acc;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(int mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	@Override
	public String toString() {
		return "\nCustomer \nID: " + id + "\nName: " + name + "\nAge: " + age + "\nMobile Number: " + mobileNum + "\nPassport Number"
				+ passportNum + "\nDate of Birth: " + DOB + "\nAccount: " + acc;
	}
	
	
}
