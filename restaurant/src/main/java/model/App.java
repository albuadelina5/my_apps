package model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Restaurant my_restaurant = (Restaurant) context.getBean("restaurant");
		my_restaurant.createRandomScenario();

	}

}
