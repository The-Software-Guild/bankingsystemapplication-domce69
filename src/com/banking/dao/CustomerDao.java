import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public interface CustomerDao {
	
	//Scanner userIn, ArrayList<Customer> customers
	Customer createCustomer(Scanner userIn, ArrayList<Customer> customers);
	void printCustomer(Scanner userIn, ArrayList<Customer> customers, int id);
	void assignCustomerAccount(Scanner userIn, ArrayList<Customer> customers); 
	Customer findCustomer(Scanner userIn, ArrayList<Customer> customers) throws CustomerNotFoundException;
	LocalDate setDob(Scanner userIn, ArrayList<Customer> customers);
}