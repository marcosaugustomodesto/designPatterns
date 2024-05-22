package br.com.modesto.factorymethod;

public class TestPizzaStore {

	public static void main(String[] args) {
		PizzaStore store = new NYPizzaStore();
		store.order("cheese");

		store.order("embutido");

		store.order("meat");

		PizzaStore store2 = new ChicagoPizzaStore();
		store.order("cheese");

		store.order("embutido");

		store.order("meat");

	}

}
