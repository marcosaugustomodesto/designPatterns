package br.com.modesto.factorymethod;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza create(String type) {
		if ("cheese".equals(type)) {
			return new Bufala();
		} else if ("embutido".equals(type)) {
			return new Presunto();

		} else if ("meat".equals(type)) {
			return new Bacon();
		}
		return null;
	}

}
