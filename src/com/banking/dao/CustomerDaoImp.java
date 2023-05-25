import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerDaoImp implements CustomerDao {

	@Override
	public Customer createCustomer(Scanner userIn, ArrayList<Customer> customers) {
		//d
		String name;
		int age;
		int mobileNum;
		String passportNum;
		Account acc;
		LocalDate dob;
		
		System.out.println("Please enter Customer Name: ");
		name = userIn.next();
		System.out.println("Please enter Customer Age: ");
		age = userIn.nextInt();
		System.out.println("Please enter Customer Mobile Number: ");
		mobileNum = userIn.nextInt();
		System.out.println("Please enter Customer Passport Number: ");
		passportNum = userIn.next();
		
		dob = setDob(userIn, customers);
		Customer c = new Customer(name, age, mobileNum, passportNum, dob);
		customers.add(c);
		
		return c;
	}

	@Override
	public void printCustomer(Scanner userIn, ArrayList<Customer> customers, int id) {
		System.out.println(customers.get(id));
		
	}

	@Override
	public void assignCustomerAccount(Scanner userIn, ArrayList<Customer> customers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer findCustomer(Scanner userIn, ArrayList<Customer> customers) throws CustomerNotFoundException {
		boolean flag = false;
		while(!flag) {
				System.out.println("Please enter Customer ID: ");
				int cId = userIn.nextInt();
				for(Customer c: customers) {
					if(c.getId() == cId) {
						return c;
					} else {
						CustomerNotFoundException e = new CustomerNotFoundException("Customer not found");
						throw e;
					}
				}
		}
		return null;
	}

	@Override
	public LocalDate setDob(Scanner userIn, ArrayList<Customer> customers) {

		boolean valid = false ;
		do {
			LocalDate dob;
			System.out.println("Enter your DOB in the format of DD/MM/YYYY: ");
			String userDob = userIn.next();
			try {
				int day = Integer.parseInt(userDob.substring(0, 2));
				int month = Integer.parseInt(userDob.substring(3, 5));
				int year = Integer.parseInt(userDob.substring(6, 10));
				
				if(year <= 2022) {
					
					if(month > 0 && month < 13) {
						
						if(day > 0 && day < 32) {
							System.out.println("DOB entered: " + day + "/" + month + "/" + year);
							dob = LocalDate.of(year, month, day);
							return dob;
						} else {
							System.out.println("Invalid Day. Day of birth must be between 1 - 31");
							System.out.println("Day: " + day + "\nMonth: " + month + "\nYear: " + year);
						}
					} else {
						System.out.println("Invalid Month. Month of birth must be between 1 - 12");
						System.out.println("Day: " + day + "\nMonth: " + month + "\nYear: " + year);
					}
				} else {
					System.out.println("Invalid Year. Year of birth must be before 2022");
					System.out.println("Day: " + day + "\nMonth: " + month + "\nYear: " + year);
				}
				
			} catch (NumberFormatException e){
				System.out.println("INVAILD INUPT");		
			}
			
		} while(true);
		//System.out.println("Day: " + day + "\nMonth: " + month + "\nYear: " + year);
		
	}

}
