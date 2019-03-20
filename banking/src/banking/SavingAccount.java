package banking;

public class SavingAccount extends AbstractAccount {

	double interest;

	public double getInterest() {
		return interest;
	}
	
	public SavingAccount(double balance, double interest) throws Exception{
		if (balance < 0 || interest < 0) {
			throw new Exception("Parameters must be positive");
		} 
		this.balance = balance;
		this.interest = interest;
	}
	
	public void withdraw(double amount) throws IllegalArgumentException {
		if (this.balance >= amount)
			this.balance -= amount;
		else
			throw new IllegalArgumentException();
	}
	
	public double maximumAmmountToWithdraw() {
		return this.balance;
	}
}
