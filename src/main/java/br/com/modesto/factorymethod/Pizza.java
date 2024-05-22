package br.com.modesto.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	List<String> topings = new ArrayList<>();
	
	public void prepare() {
		System.out.println("preparing " + name);
		System.out.println("Tossing dough ...");
		System.out.println("Adding sauce ...");
		System.out.println("Adding toppings ...");
		for(String t: topings) {
			System.out.println("  " + t);
		}
	}
	
	
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
