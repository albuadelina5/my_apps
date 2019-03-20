package banking;

import exceptions.NotEnoughFundsException;
import exceptions.OverdraftLimitExceededException;

public class CheckingAccount extends AbstractAccount{

	double overdraftValue;

	public double getOverDraftValue() {
		return overdraftValue;
	}
	
	public void withdraw(double amount) throws IllegalArgumentException, NotEnoughFundsException {
		if (amount < 0)
			throw new IllegalArgumentException();
		if (amount > this.maximumAmmountToWithdraw()) {
			this.balance -= amount;
		}
		else
			throw new NotEnoughFundsException();
	}
	
	public CheckingAccount(double balance, double overdraft){
		if (overdraft < 0)
			throw new  IllegalArgumentException();
	}
	
	public double maximumAmmountToWithdraw() {
			return this.balance + this.overdraftValue;
			
	}
	
	
}
