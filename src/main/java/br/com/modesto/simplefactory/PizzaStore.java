package br.com.modesto.simplefactory;

public class PizzaStore {

	public final SimpleFactory simpleFactory; 
	
	public PizzaStore() {
		this.simpleFactory = new SimpleFactory();
	}

	public Pizza order(String type) {

		Pizza pizza = simpleFactory.create(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
		
	}


	
}
