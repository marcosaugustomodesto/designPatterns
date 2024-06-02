package br.com.modesto.compound;

public class Simulate1 {
	public static void main(String[] args) {

		QuackBehavior decoy = new DecoyDuck();
		QuackBehavior mallard = new MallardDuck();
		QuackBehavior ruber = new RuberDuck();
		QuackBehavior gooseAdaptader = new Goosedapter(new Goose());

		simulate(decoy);
		simulate(mallard);
		simulate(ruber);
		simulate(gooseAdaptader);
	}

	private static void simulate(QuackBehavior duck) {

		duck.quack();
	}
}
