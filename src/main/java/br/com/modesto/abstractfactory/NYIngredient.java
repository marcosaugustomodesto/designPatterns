package br.com.modesto.abstractfactory;

import java.util.Arrays;
import java.util.List;

public class NYIngredient implements IngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public List<Topping> createTopping() {
		return Arrays.asList(new Oregano());
	}

}
