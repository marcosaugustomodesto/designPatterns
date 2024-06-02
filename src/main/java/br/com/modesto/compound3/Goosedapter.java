package br.com.modesto.compound3;

public class Goosedapter implements QuackBehavior {

	Goose goose;
	
	public Goosedapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.bonck();
	}

}
