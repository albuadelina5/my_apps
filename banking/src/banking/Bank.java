package banking;

import java.util.ArrayList;
import java.util.Calendar;

import exceptions.ClientExistsException;

public class Bank {

	
	static int printedClients, emailedClients, debuggedClients;
	public ArrayList<Client> clients = new ArrayList<Client>();
	public ClientRegistrationListener [] listeners = {new PrintClientListener(), new EmailNotificationListener(), new DebugListener()}; 
	
	public ArrayList<Client> getClients() {
		return clients;
	}

	public void addClient(Client client) throws ClientExistsException {
		for(int j = 0;j < this.clients.size();j++) {
			if (client.name.equals(this.clients.get(j).name))
				throw new ClientExistsException();
		}
		for(int i= 0; i< this.listeners.length;i++) {
			this.listeners[i].onClientadded(client);
		}
		this.clients.add(client);
	}
	
	public void printMaximumAmmountToWithdraw() {
		System.out.println("Mximum ammount ot withdraw");
		for (int i = 0; i< this.clients.size();i++) {
			Client client = this.clients.get(i);
			AbstractAccount account = client.getAccounts().get(0);
			System.out.println(client.name + " MAX Amount: " + account.maximumAmmountToWithdraw());
		}
	}
	
	class PrintClientListener implements ClientRegistrationListener{

		@Override
		public void onClientadded(Client client) {
			System.out.println("Client "+ client.name+ " has been added");
			
		}
		
	}
	class EmailNotificationListener implements ClientRegistrationListener{

		@Override
		public void onClientadded(Client client) {
			System.out.println("Notification email for client "+client.name+" to be sent");
			
		}
		
	}
	
	class DebugListener implements ClientRegistrationListener{

		@Override
		public void onClientadded(Client client) {
			Calendar calendar = Calendar.getInstance();
			System.out.println(calendar.getTime().toString()+" "+client.name);
			
		}
		
	}
	
}
