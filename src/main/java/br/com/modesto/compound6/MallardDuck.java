package br.com.modesto.compound6;

public class MallardDuck implements QuackBehavior {

	Observable observable;

	public MallardDuck() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("Quack");
		notifiObservers();
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
