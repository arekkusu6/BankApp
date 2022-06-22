
public class Account {
	private double balance = 0;
	private double interest = 0.02;
	private int accountNumber;
	private static int numberOfAccounts = 1000000;
	
	Account(){
		accountNumber = numberOfAccounts++;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterest() {
		return interest * 100;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void withdraw(double amount) {
		if (amount + 5 > balance) {
			System.out.println("You have insufficient funds.");
			return;
		} 
		balance -= amount + 5;
		checkInterest(0);
		System.out.println("You have withdrawn $" + String.format("%.2f", amount)  + " dollars and incurred a fee of $5.00");
		System.out.println("You now have a balance of $" + String.format("%.2f", balance));
	}
	
	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("You cannot deposit a negative amount!");
			return;
		}
		checkInterest(amount);
		amount = amount + amount * interest;
		balance += amount;
		System.out.println("You have deposited $" + String.format("%.2f", amount) + " dollars with an interest rate of " + (interest * 100) + "%");
		System.out.println("You now have a balance of $" + String.format("%.2f", balance));
	}
	
	public void checkInterest(double amount) {
		if(balance > 10000) {
			interest = 0.05;
		} else {
			interest = 0.02;
		}
	}
}
