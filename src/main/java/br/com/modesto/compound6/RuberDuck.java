package br.com.modesto.compound6;

public class RuberDuck implements QuackBehavior {

	Observable observable;

	public RuberDuck() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("squeek");
	}

	@Override
	public void registerObservable(Observer observer) {
		this.observable.registerObservable(observer);

	}

	@Override
	public void notifiObservers() {
		this.notifiObservers();
	}
}
