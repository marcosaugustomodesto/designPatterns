package br.com.modesto.singleton;

public class SingletonEagle {

	private static SingletonEagle singleton1 = new SingletonEagle();

	private SingletonEagle() {

	}

	public static SingletonEagle getInstance() {
		return singleton1;
	}

}
