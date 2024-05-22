package br.com.modesto.beverage;

public class TestBeverage {
	public static void main(String[] args) {
	    Beverage beverage = new Expresso();
	    beverage = new Mocka(beverage);
	    beverage = new Milk(beverage);
	    beverage = new Milk(beverage);
	    beverage = new Milk(beverage);
	    System.out.println(beverage.description());
	    System.out.println(beverage.cost());
	}

}
