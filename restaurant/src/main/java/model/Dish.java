package model;

public class Dish {

	String name;
	int price;
	
	Dish(String name,int price){
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + "]";
	}
	
}
