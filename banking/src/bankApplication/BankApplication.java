package bankApplication;

import java.util.Iterator;

import java.util.Random;

import banking.Client.Gender;
import banking.*;

public class BankApplication {

	
	public static void main(String args[]) {
		
		Bank bank = new Bank();
		
		Random random = new Random();
		for(int i = 0, clients = random.nextInt(9)+1;i< clients;i++) {
			int gen = random.nextInt();
			Client.Gender gender;
			if (gen == 1)
				gender = Client.Gender.MALE;
			else
				gender = Client.Gender.FEMALE;
			Client client = new Client("Client"+i,gender);
			bank.addClient(client);
			int id = random.nextInt();
			double balance = random.nextDouble()* 10000;
			try {
				if (i < clients / 2 )
					client.addAccount(new CheckingAccount(id,balance));
				else
					client.addAccount(new SavingAccount(balance, 10));
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		Client aa = new Client("aaaaaaa",Client.Gender.MALE);
		bank.addClient(aa);
		try {
			aa.addAccount(new SavingAccount(11,10000));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		modifyBank(bank, random.nextDouble());
		bank.printMaximumAmmountToWithdraw();
		
	}
	
	static void modifyBank(Bank bank,double amount) {
		Random random = new Random();
		int clients = random.nextInt(bank.clients.size()-1)+1;
		
		for (int i = 0;i<clients;i++) {
			int clientIndex = random.nextInt(bank.clients.size());
			double change = random.nextDouble()*1000;
			int sign = random.nextInt(1);
			if (sign == 1)
				bank.clients.get(clientIndex).getAccounts().get(0).withdraw(change);
			else
				bank.clients.get(clientIndex).getAccounts().get(0).deposit(change);
		}
	}
	
	static void printBalances(Bank bank) {
		Iterator<Client> iter = bank.clients.iterator();
		
		while(iter.hasNext()) {
			Client c = iter.next();
			c.getClientGreeting();
			System.out.println(c.name + "  balance: "+ c.accounts.get(0).getBalance());
		}
	}
}
