package application;

public class PizzeriaBrest extends Pizzeria {
	public PizzeriaBrest() {
		super.pizzaFactory = PizzaFactoryBrest.getInstance();
	}
}
