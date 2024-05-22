package br.com.modesto.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	List<Topping> topings = new ArrayList<>();

	public abstract void prepare();

	public void cut() {
		System.out.println("Cut in 8 slices");

	}

	public void bake() {
		System.out.println("put in a oven with 200 celcius deegres");
	}

	public void box() {
		System.out.println("put the pizza in the box");

	}

	public String getName() {
		return name;
	}

}
