package banking;

public class Account {

	int id;
	public double balance;
	
	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	
	
	double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) throws IllegalArgumentException {
		this.balance += amount;
	}
	
	public void withdraw(double amount) throws IllegalArgumentException {
		if (this.balance >= amount) {
			this.balance -= amount;
		}
		
	}
	
	
}
