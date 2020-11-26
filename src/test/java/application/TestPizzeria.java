package application;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPizzeria {

	@Test
	public void testPizzaExiste() {
		Pizzeria boutiqueBrest = new PizzeriaBrest();
		Pizza pizza = boutiqueBrest.creerPizza("fromage");

		assertNotNull(pizza);
	}
	
	@Test
	public void testPizzaType() {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().creer("Brest");
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().creer("Strasbourg");

        Pizza pizza1 = boutiqueBrest.commanderPizza("fromage");
        Pizza pizza2 = boutiqueBrest.commanderPizza("poivron");
        Pizza pizza3 = boutiqueBrest.commanderPizza("grecque");
        Pizza pizza4 = boutiqueStrasbourg.commanderPizza("fromage");
        Pizza pizza5 = boutiqueStrasbourg.commanderPizza("poivron");
        Pizza pizza6 = boutiqueStrasbourg.commanderPizza("grecque");
		assertEquals("Mauvais type de pizza", PizzaFromageStyleBrest.class, pizza1.getClass());
		assertEquals("Mauvais type de pizza", PizzaPoivronsStyleBrest.class, pizza2.getClass());
		assertEquals("Mauvais type de pizza", PizzaGrecqueStyleBrest.class, pizza3.getClass());
		assertEquals("Mauvais type de pizza", PizzaFromageStyleStrasbourg.class, pizza4.getClass());
		assertEquals("Mauvais type de pizza", PizzaPoivronsStyleStrasbourg.class, pizza5.getClass());
		assertEquals("Mauvais type de pizza", PizzaGrecqueStyleStrasbourg.class, pizza6.getClass());
	}
	
	
	@Test
	public void testPizzeriaType() {
		Pizzeria p1 = new PizzeriaBrest();
		Pizzeria p2 = new PizzeriaStrasbourg();
		assertEquals("Mauvais type de pizzeria", PizzeriaBrest.class, p1.getClass());
		assertEquals("Mauvais type de pizzeria", PizzeriaStrasbourg.class, p2.getClass());
	}
	
	@Test
	public void testDeuxPizzeria() {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().creer("Brest");
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().creer("Strasbourg");

        Pizza pizza1 = boutiqueBrest.commanderPizza("fromage");
        Pizza pizza2 = boutiqueStrasbourg.commanderPizza("poivron");
        Pizza pizza3 = boutiqueBrest.commanderPizza("grecque");
        assertTrue("sauce style Brest et fromage".equals(pizza1.nom));
        assertTrue("pâte style Strasbourg et poivron".equals(pizza2.nom));
        assertTrue("pâte style Brest et grecque".equals(pizza3.nom));
	}
	
	@Test
	public void testPizzaFromage() {
		Pizzeria boutiqueBrest = new PizzeriaBrest();
		Pizza pizza1 = boutiqueBrest.creerPizza("fromage");
		
		Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg();
		Pizza pizza2 = boutiqueStrasbourg.creerPizza("fromage");
		
		assertTrue(pizza1.getClass() == PizzaFromageStyleBrest.class);
		
		assertEquals(pizza2.getClass(), PizzaFromageStyleStrasbourg.class);
	}

}
