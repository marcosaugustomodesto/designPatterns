package br.com.modesto.templatemethod;

public class MakeBeverages {
	public static void main(String[] args) {
        BeveragePrepare beverage = new CoffeePrepare();
        beverage.prepare();
        
        beverage = new TeaPrepare();
        beverage.prepare();
	}
}
