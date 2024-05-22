package br.com.modesto.simplefactory;

public class SimpleFactory {

	public Pizza create(String type) {
		if("cheese".equals(type)) {
			return new Mussarela();
		} else if ("peperoni".equals(type)) {
			return new Peperoni();
			
		} else if("calabresa".equals(type)) {
			return new Calabresa();
		}
		return null;
	}
}