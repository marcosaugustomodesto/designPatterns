package br.com.modesto.beverage;

public class Expresso implements Beverage {

	@Override
	public double cost() {
		return 10.0;

	}

	@Override
	public String description() {
		return "Expresso";

	}

}
