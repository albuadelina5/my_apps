package model;

import java.util.ArrayList;
import java.util.Random;

public class Client {

	int id;
	String firstName;
	String lastName;
	String phoneNumber;
	String email;
	public Bill createOrder(Menu menu){
		Random random = new Random(); 
		int numberOfDishes = random.nextInt(5)+1;
		ArrayList<Dish> order = new ArrayList<Dish>();
		
		for(int i=0;i<numberOfDishes;i++) {
			order.add(menu.getDishes().get(random.nextInt(menu.getDishes().size())));
		}
		return new Bill(order);
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + "]";
	}
	
	
}
