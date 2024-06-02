package br.com.modesto.compound6;

public class CountQuack implements QuackBehavior {

	Observable observable;

	private QuackBehavior duck;
	private static int count = 0;

	public CountQuack(QuackBehavior duck) {
		this.duck = duck;
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		duck.quack();
		this.count++;
	}

	public static int getCount() {
		return count;
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
