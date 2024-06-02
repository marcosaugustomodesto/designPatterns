package br.com.modesto.compound6;

public class DecoyDuck implements QuackBehavior {

	Observable observable;

	public DecoyDuck() {
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("Kuack");
		notifiObservers();
	}

	@Override
	public void registerObservable(Observer observer) {
		observable.registerObservable(observer);
	}

	@Override
	public void notifiObservers() {
		observable.notifiObservers();
	}

}
