
public class Customer {
	private final String firstName;
	private final String lastName;
	private final String social;
	private final Account account;

	Customer(String firstName, String lastName, String social, Account account){
		this.firstName = firstName;
		this.lastName = lastName;
		this.social = social;
		this.account = account;
	}
	
	@Override 
	public String toString() {
		return "\nCustomer Information\n" +
				"First Name:" + " " + firstName + "\n" +
				"Last Name:" + " " + lastName + "\n" +
				"SSN:" + " " + social + "\n" +
				account;
	}
	
	public String basicInfo() {
		return "Last Name: " + lastName + "   " +
				"Account: " + account.getAccountNumber();
	}
	
	Account getAccount() {
		return account;
	}
}
