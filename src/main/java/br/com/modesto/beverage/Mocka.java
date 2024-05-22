package br.com.modesto.beverage;

public class Mocka implements CondimentBeverage {
	
	public final Beverage beverage;
	
	public Mocka(Beverage beverage) {
	   this.beverage = beverage;	
	}	

	@Override
	public double cost() {
		
		return this.beverage.cost() + 6.1;
	}

	@Override
	public String description() {
		return this.beverage.description() + " with Mocka";
	}

}
