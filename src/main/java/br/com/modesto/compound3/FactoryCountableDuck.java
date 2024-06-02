package br.com.modesto.compound3;

public class FactoryCountableDuck implements AbstractFactoryDuck {

	@Override
	public QuackBehavior createDecoyDuck() {
		return new CountQuack(new DecoyDuck());
	}

	@Override
	public QuackBehavior createMallardDuck() {
		return new CountQuack(new MallardDuck());
	}

	@Override
	public QuackBehavior createRuberDuck() {
		return new CountQuack(new RuberDuck());
	}

}
