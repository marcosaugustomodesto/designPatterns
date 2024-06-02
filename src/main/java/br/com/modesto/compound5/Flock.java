package br.com.modesto.compound5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements QuackBehavior {

	List<QuackBehavior> lista = new ArrayList<>();

	@Override
	public void quack() {
		Iterator<QuackBehavior> i = lista.iterator();
		while (i.hasNext()) {
			QuackBehavior duck = i.next();
			duck.quack();
		}
	}

	public void add(QuackBehavior duck) {
		lista.add(duck);
	}

}
