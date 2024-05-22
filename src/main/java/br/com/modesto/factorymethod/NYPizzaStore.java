package br.com.modesto.factorymethod;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza create(String type) {
		if ("cheese".equals(type)) {
			return new Mussarela();
		} else if ("embutido".equals(type)) {
			return new Peperoni();

		} else if ("meat".equals(type)) {
			return new Calabresa();
		}
		return null;
	}

}
