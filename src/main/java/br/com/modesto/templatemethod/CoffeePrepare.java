package br.com.modesto.templatemethod;

public class CoffeePrepare extends BeveragePrepare {

	@Override
	public void brew() {
		System.out.println("Brew the coffee");
		
	}

	@Override
	public void addCondiments() {
		System.out.println("Add Milk");
	}

	@Override
	public void hook() {
		System.out.println("Add sweetener");
	}

	
}
