package br.com.modesto.compound6;

public class Simulate1 {
	public static void main(String[] args) {

		AbstractFactoryDuck factory = new FactoryCountableDuck();
		AbstractFactoryDuck factory2 = new FactoryDuck();
		
		
		QuackBehavior decoy = factory.createDecoyDuck();
		QuackBehavior mallard = factory.createMallardDuck();
		QuackBehavior ruber = factory.createRuberDuck();
		QuackBehavior gooseAdaptader = new Goosedapter(new Goose());

		Flock flock = new Flock();
		flock.add(decoy);
		flock.add(mallard);
		flock.add(ruber);
		flock.add(gooseAdaptader);
		
		System.out.println("Duck simulator: with observer");
		
		Quackologist quackologist = new Quackologist();
		
		flock.registerObservable(quackologist);

		simulate(flock);
		
		System.out.printf("Duck quacked %s vezes", CountQuack.getCount());

		QuackBehavior mallard2 = factory2.createMallardDuck();

		mallard2.registerObservable(quackologist);
		
		simulate(mallard2);
		
		System.out.printf("Duck quacked %s vezes", CountQuack.getCount());

	}

	private static void simulate(QuackBehavior duck) {
		duck.quack();

	}
}
