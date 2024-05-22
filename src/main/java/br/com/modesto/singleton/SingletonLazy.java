package br.com.modesto.singleton;

public class SingletonLazy {

	private static SingletonLazy singleton1;

	private SingletonLazy() {

	}

	public static SingletonLazy getInstance() {
		if (singleton1 == null) {
			singleton1 = new SingletonLazy();
		}
		return singleton1;
	}

}
