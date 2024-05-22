package br.com.modesto.simplefactory;

public class Peperoni implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Peperoni Pizza");

	}

	@Override
	public void cut() {
		System.out.println("Cut in 8 slices");

	}

	@Override
	public void bake() {
		System.out.println("put in a oven with 200 celcius deegres");
	}

	@Override
	public void box() {
		System.out.println("put the pizza in the box");

	}

}
