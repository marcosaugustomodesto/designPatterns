package br.com.modesto.simplefactory;

public class TestPizzaStore {

	public static void main(String[] args) {
		PizzaStore store = new PizzaStore();
		store.order("cheese");
		
		store.order("peperoni");
		
		store.order("calabresa");
	}
	
}
