package br.com.modesto.compound5;

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
