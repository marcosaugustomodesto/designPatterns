package br.com.modesto.compound6;

public class Quackologist implements Observer {

	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck.getClass().getSimpleName() + " jusk quacked.");

	}

}
