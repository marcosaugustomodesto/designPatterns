package br.com.modesto.compound4;

public class Simulate1 {
	public static void main(String[] args) {

		AbstractFactoryDuck factory = new FactoryCountableDuck();

		QuackBehavior decoy = factory.createDecoyDuck();
		QuackBehavior mallard = factory.createMallardDuck();
		QuackBehavior ruber = factory.createRuberDuck();
		QuackBehavior gooseAdaptader = new CountQuack(new Goosedapter(new Goose()));

		simulate(decoy);
		simulate(mallard);
		simulate(ruber);
		simulate(gooseAdaptader);

		System.out.printf("Duck quacked %s vezes", CountQuack.getCount());

	}

	private static void simulate(QuackBehavior duck) {
		duck.quack();

	}
}
