package br.com.modesto.abstractfactory;

public class NYPizzaStore extends PizzaStore {

	private IngredientFactory ingredient = new NYIngredient();
	
	@Override
	protected Pizza create(String type) {
		if ("cheese".equals(type)) {
			return new Mussarela(ingredient);
		} else if ("embutido".equals(type)) {
			return new Peperoni(ingredient);

		} else if ("meat".equals(type)) {
			return new Calabresa(ingredient);
		}
		return null;
	}

}
