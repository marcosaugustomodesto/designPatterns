package br.com.modesto.singleton;

public class SingletonLazySyncronizedVolatile {

	private static volatile SingletonLazySyncronizedVolatile singleton1;

	private SingletonLazySyncronizedVolatile() {

	}

	public static SingletonLazySyncronizedVolatile getInstance() {
		synchronized (singleton1) {
			if (singleton1 == null) {
				singleton1 = new SingletonLazySyncronizedVolatile();
			}
		}
		return singleton1;
	}

}
