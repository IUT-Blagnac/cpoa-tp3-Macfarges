package application;

public class PizzeriaStrasbourg extends Pizzeria {
	
	public PizzeriaStrasbourg() {
		super.pizzaFactory = PizzaFactoryStrasbourg.getInstance();
	}
}
