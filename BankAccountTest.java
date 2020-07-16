package company.assignment.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// 
		BankAccount shivaAccount = new BankAccount("Shiva");
		shivaAccount.depositFund(100000);
		shivaAccount.withdrawFund(1000,50);
		
		BankAccount ramAccount = new BankAccount("Ram", 10000);
		ramAccount.withdrawFund(5000,100);
		
		shivaAccount.depositFund(100);
	}

}
