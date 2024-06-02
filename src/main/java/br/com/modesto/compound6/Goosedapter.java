package br.com.modesto.compound6;

public class Goosedapter implements QuackBehavior {

	Observable observable;

	Goose goose;

	public Goosedapter(Observable observable) {
		this.observable = observable;
	}

	public Goosedapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.bonck();
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
