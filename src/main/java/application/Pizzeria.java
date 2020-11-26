package application;

public abstract class Pizzeria {
	protected PizzaFactory pizzaFactory;
	
	public final Pizza commanderPizza(String type) {
		Pizza pizza;
		pizza = creerPizza(type);
		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();
		return pizza;
	}

	protected Pizza creerPizza(String style) {
		return pizzaFactory.creer(style);
	}

}