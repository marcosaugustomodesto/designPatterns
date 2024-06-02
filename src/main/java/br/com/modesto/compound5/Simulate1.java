package br.com.modesto.compound5;

public class Simulate1 {
	public static void main(String[] args) {

		AbstractFactoryDuck factory = new FactoryCountableDuck();

		QuackBehavior decoy = factory.createDecoyDuck();
		QuackBehavior mallard = factory.createMallardDuck();
		QuackBehavior ruber = factory.createRuberDuck();
		QuackBehavior gooseAdaptader = new Goosedapter(new Goose());

		Flock flock = new Flock();
		flock.add(decoy);
		flock.add(mallard);
		flock.add(ruber);
		flock.add(gooseAdaptader);

		simulate(flock);
		
		System.out.printf("Duck quacked %s vezes", CountQuack.getCount());

	}

	private static void simulate(QuackBehavior duck) {
		duck.quack();

	}
}
