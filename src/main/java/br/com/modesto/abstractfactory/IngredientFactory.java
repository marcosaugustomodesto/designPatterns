package br.com.modesto.abstractfactory;

import java.util.List;

public interface IngredientFactory {

	public Dough createDough();

	public Sauce createSauce();

	public List<Topping> createTopping();

}
