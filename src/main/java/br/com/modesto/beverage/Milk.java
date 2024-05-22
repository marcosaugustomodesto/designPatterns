package br.com.modesto.beverage;

public class Milk implements CondimentBeverage {
	
	public final Beverage beverage;
	
	public Milk(Beverage beverage) {
	   this.beverage = beverage;	
	}	

	@Override
	public double cost() {
		
		return this.beverage.cost() + 5.4;
	}

	@Override
	public String description() {
		return this.beverage.description() + " with Milk";
	}

}
