package br.com.modesto.abstractfactory;

public class ChicagoPizzaStore extends PizzaStore {

	private IngredientFactory ingredient = new ChigacoIngredient();

	@Override
	protected Pizza create(String type) {
		if ("cheese".equals(type)) {
			return new Bufala(ingredient);
		} else if ("embutido".equals(type)) {
			return new Presunto(ingredient);

		} else if ("meat".equals(type)) {
			return new Bacon(ingredient);
		}
		return null;
	}

}
