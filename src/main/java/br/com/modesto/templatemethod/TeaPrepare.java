package br.com.modesto.templatemethod;

public class TeaPrepare extends BeveragePrepare {

	@Override
	public void brew() {
		System.out.println("Steep the tea");

	}

	@Override
	public void addCondiments() {
		System.out.println("Add lemon");
	}

}
