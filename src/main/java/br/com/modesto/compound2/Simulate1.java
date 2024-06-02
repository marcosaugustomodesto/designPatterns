package br.com.modesto.compound2;

public class Simulate1 {
	public static void main(String[] args) {

		QuackBehavior decoy = new CountQuack(new DecoyDuck());
		QuackBehavior mallard = new CountQuack(new MallardDuck());
		QuackBehavior ruber = new CountQuack(new RuberDuck());
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
