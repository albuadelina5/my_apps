package banking;

import exceptions.NotEnoughFundsException;
import exceptions.OverdraftLimitExceededException;

public interface BankAccount {

	void withdraw(double amount) throws IllegalArgumentException, OverdraftLimitExceededException, NotEnoughFundsException;
	void deposit(double amount) throws IllegalArgumentException;
	double maximumAmmountToWithdraw();
}
