package br.com.modesto.compound6;

public interface AbstractFactoryDuck {
	QuackBehavior createDecoyDuck();

	QuackBehavior createMallardDuck();

	QuackBehavior createRuberDuck();
}
