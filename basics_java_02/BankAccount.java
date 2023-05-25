package basics_java_02;

public class BankAccount {

	private int accountNumber;
	private double balance;
	private String customerName;
	
	public int getAccountNumber() {
		return accountNumber;
	}


	public double getBalance() {
		return balance;
	}

	
	public String getCustomerName() {
		return customerName;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
		}else {
			System.out.println("Insufficient funds.");
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
