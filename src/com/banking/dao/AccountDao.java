import java.util.ArrayList;
import java.util.Scanner;

public interface AccountDao {
	void assignAccount(Scanner userIn, ArrayList<Customer> customers);
	void applyInterest(Scanner userIn, ArrayList<Customer> customers);
}
