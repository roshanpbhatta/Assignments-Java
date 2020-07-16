package company.assignment.bankaccount;

public class BankAccount {

	private String accountName;
	private static int accountNumber = 1000;
	private int accNum;
	private double initialBalance ;
	
	public BankAccount(String accountName) {
	
		this.accountName = accountName;
		this.initialBalance = 0;
		this.accNum = accountNumber++;
		displayInfo();
	}
	
	public BankAccount(String accountName,double initialBalance) {
		
		this.accountName = accountName;
		this.initialBalance = initialBalance;
		this.accNum = accountNumber++;
		displayInfo();
	}
	
	public void depositFund(double amount) {
		
		initialBalance = initialBalance + amount;
		displayInfo();
	}
	
	public void depositFund(double amount, double interest) {
		
		initialBalance = initialBalance + (initialBalance *interest/100) + amount; 
		displayInfo();
	}
	
	public void withdrawFund(double amount) {
		
		initialBalance = initialBalance - amount;
		displayInfo();
	}
	
    public void withdrawFund(double amount,double fee) {
		
    	initialBalance = initialBalance - (amount + fee);
    	displayInfo();
	}
	
	public void displayInfo() {
		
		System.out.println("===================");
		System.out.println("Account Name: "+accountName);
		System.out.println("Account Number: "+ accNum);
		System.out.println("Total Balance: "+initialBalance);
		System.out.println("===================");
	} 

}
