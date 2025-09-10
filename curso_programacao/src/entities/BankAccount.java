package entities;

public class BankAccount {

	private static double TAX = 5.00;
	private final int accountNumber;
	private String accountHolder;
	private double accountValue;
	
	public BankAccount(int accountNumber, String accountHolder,  double accountValue) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(accountValue);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountValue() {
		return accountValue;
	}

	public void deposit(double depositValue) {
		this.accountValue += depositValue; 
	}
	
	public void withdraw (double withdrawValue) {
		this.accountValue -= withdrawValue + TAX; 
	}
	
	public String toString() {
		return "Updated account data: \n" 
			+ "Account " + this.accountNumber
			+ ", Holder: " + this.accountHolder
			+ ", Balance: $" + String.format("%.2f", this.accountValue);
	}
	
	
	
}
