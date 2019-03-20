package banking;

import java.util.ArrayList;

public class Client {

	public String name;
	public ArrayList<AbstractAccount> accounts = new ArrayList<AbstractAccount>();
	public enum Gender {
			MALE,FEMALE;
		
			private String greeting;
			
			static {
				MALE.greeting = "Mr.";
				FEMALE.greeting = "Mrs.";
			}
		
			public String getGreeting() {
				return this.greeting;
			}
		};
	Gender gender;
	
	public ArrayList<AbstractAccount> getAccounts() {
		return accounts;
	}

	public Client(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public void addAccount(AbstractAccount account) {
		this.accounts.add(account);
	}
	
	public void getClientGreeting() {
		System.out.println("Hello " + this.gender.getGreeting());
	}
	
}
