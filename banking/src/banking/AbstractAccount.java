package banking;

import exceptions.NotEnoughFundsException;
import exceptions.OverdraftLimitExceededException;

public class AbstractAccount implements BankAccount{

	double balance;
	
	public double getBalance() {
		return balance;
	}

	@Override
	public void withdraw(double amount) throws IllegalArgumentException, OverdraftLimitExceededException, NotEnoughFundsException {
		this.balance -= amount;
		
	}

	@Override
	public void deposit(double amount) throws IllegalArgumentException {
		this.balance += amount;
		
	}

	@Override
	public double maximumAmmountToWithdraw() {
		return this.balance;
		
	}
	
}
