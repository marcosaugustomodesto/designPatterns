package br.com.modesto.compound4;

public interface AbstractFactoryDuck {
	QuackBehavior createDecoyDuck();

	QuackBehavior createMallardDuck();

	QuackBehavior createRuberDuck();
}
