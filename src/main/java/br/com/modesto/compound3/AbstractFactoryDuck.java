package br.com.modesto.compound3;

public interface AbstractFactoryDuck {
	QuackBehavior createDecoyDuck();

	QuackBehavior createMallardDuck();

	QuackBehavior createRuberDuck();
}
