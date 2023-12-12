import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
    private double balance;
	private Customer cust;
	Scanner input = new Scanner(System.in);
	
	/**
	 * constructor
	 * pre: none
	 * post: An account has been created. Balance and 
	 * customer data has been initialized with parameters.
	 */
	public Account(double bal, String fName, String lName, String str, String city, String st, String zip) {
		balance = bal;
		cust = new Customer(fName, lName, str, city, st, zip);
	}
	

	/** 
	 * Returns the current balance.
	 * pre: none
	 * post: The account balance has been returned.
	 */
	public double getBalance() {
	 	return(balance);
	}

	/** 
	 * A deposit is made to the account.
	 * pre: none
	 * post: The balance has been increased by the amount of the deposit.
	 */
	public void deposit(double amt) {
	 	balance += amt;
	}

	
	/** 
	 * A withdrawal is made from the account if there is enough money.
	 * pre: none
	 * post: The balance has been decreased by the amount withdrawn.
	 */
	public void withdrawal(double amt) {
	 	if (amt <= balance) {
	 		balance -= amt;
	 	} else {
	 		System.out.println("Not enough money in account.");
	 	}
	}
	
	
	/** 
	 * Returns a String that represents the Account object.
	 * pre: none
	 * post: A string representing the Account object has 
	 * been returned.
	 */
	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();

		accountString = cust.toString();
		accountString += "Current balance is " + money.format(balance);
		System.out.print("\n");
	 	return(accountString);
	}

	/** 
	 * Changes the street address of the customer.
	 * pre: none
	 * post: The customer's street address has been changed.
	 */
	public void changeAddress(String account) {
		System.out.println("Enter new street address: ");
		String str = input.nextLine();
		System.out.println("Enter new city: ");
		String c = input.nextLine();
		System.out.println("Enter new state: ");
		String s = input.nextLine();
		System.out.println("Enter new zip code: ");
		String z = input.nextLine();
		cust.newAddress(str, c, s, z);
		System.out.println(cust.toString() + "\n");
	}

}

