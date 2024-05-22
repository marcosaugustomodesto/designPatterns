package br.com.modesto.singleton;

public class SingletonLazySyncronized {

	private static SingletonLazySyncronized singleton1;

	private SingletonLazySyncronized() {

	}

	public synchronized static SingletonLazySyncronized getInstance() {
		if (singleton1 == null) {
			singleton1 = new SingletonLazySyncronized();
		}
		return singleton1;
	}

}
