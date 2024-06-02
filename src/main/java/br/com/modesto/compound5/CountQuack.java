package br.com.modesto.compound5;

public class CountQuack implements QuackBehavior {

	private QuackBehavior duck;
	private static int count = 0;

	public CountQuack(QuackBehavior duck) {
		this.duck = duck;
	}

	@Override
	public void quack() {
		duck.quack();
		this.count++;
	}

	public static int getCount() {
		return count;
	}
	
	

}
