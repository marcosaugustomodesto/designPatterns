package br.com.modesto.compound6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements QuackBehavior {

	Observable observable;

	public Flock() {
		observable = new Observable(this);
	}

	List<QuackBehavior> lista = new ArrayList<>();

	@Override
	public void quack() {
		Iterator<QuackBehavior> i = lista.iterator();
		while (i.hasNext()) {
			QuackBehavior duck = i.next();
			duck.quack();
			notifiObservers();
		}
	}

	public void add(QuackBehavior duck) {
		lista.add(duck);
	}

	@Override
	public void registerObservable(Observer observer) {
		this.observable.registerObservable(observer);
	}

	@Override
	public void notifiObservers() {
		this.observable.notifiObservers();
	}

}
