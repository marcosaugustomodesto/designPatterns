package br.com.modesto.abstractfactory;

public class Mussarela extends Pizza {

	private final IngredientFactory factory;

	public Mussarela(IngredientFactory factory) {
		name = "Pizza Mussarela";
		this.factory = factory;
	}

	@Override
	public void prepare() {
		System.out.println("preparing " + name);
		dough = factory.createDough();
		System.out.println("Tossing dough ..." + dough.name);
		sauce = factory.createSauce();
		System.out.println("Adding sauce ..." + sauce.name);
		topings.addAll(factory.createTopping());
		System.out.println("Adding toppings ...");
		for (Topping toping : topings) {
			System.out.println("  " + toping.name);
		}
	}

}
