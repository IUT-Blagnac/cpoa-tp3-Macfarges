package application;

public class PizzeriaFactory {
	private static PizzeriaFactory instance = new PizzeriaFactory();
	
	public Pizzeria creer(String style) {
		if(style.equals("Brest"))
			return new PizzeriaBrest();
		else
			return new PizzeriaStrasbourg();
	}

	public static PizzeriaFactory getInstance() {
		return instance;
	}
}
