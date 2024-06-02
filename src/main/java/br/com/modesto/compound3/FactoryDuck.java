package br.com.modesto.compound3;

public class FactoryDuck implements AbstractFactoryDuck {

	@Override
	public QuackBehavior createDecoyDuck() {
		return new DecoyDuck();
	}

	@Override
	public QuackBehavior createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public QuackBehavior createRuberDuck() {
		return new RuberDuck();
	}

}
