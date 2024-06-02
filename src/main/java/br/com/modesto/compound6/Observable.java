package br.com.modesto.compound6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {

	List<Observer> lista = new ArrayList<>();
	QuackObservable duck;
	

	public Observable(QuackObservable duck) {
		this.duck = duck;
	}

	@Override
	public void registerObservable(Observer observer) {
		lista.add(observer);
	}

	@Override
	public void notifiObservers() {
		Iterator<Observer> i = lista.iterator();
		while (i.hasNext()) {
			Observer o = i.next();
			o.update(duck);
		}
	}

}
