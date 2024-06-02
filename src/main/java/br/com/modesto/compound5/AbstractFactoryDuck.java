package br.com.modesto.compound5;

public interface AbstractFactoryDuck {
	QuackBehavior createDecoyDuck();

	QuackBehavior createMallardDuck();

	QuackBehavior createRuberDuck();
}
