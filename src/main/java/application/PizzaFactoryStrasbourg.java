package application;

public class PizzaFactoryStrasbourg extends PizzaFactory {
	private static PizzaFactoryStrasbourg instance = new PizzaFactoryStrasbourg();

	public Pizza creer(String name) {
		if (name.equals("fromage")) {
			return new PizzaFromageStyleStrasbourg();
		} else if (name.equals("grecque")) {
			return new PizzaGrecqueStyleStrasbourg();
		} else {
			return new PizzaPoivronsStyleStrasbourg();
		}
	}
	
	public static PizzaFactoryStrasbourg getInstance() {
		return instance;
	}
}
