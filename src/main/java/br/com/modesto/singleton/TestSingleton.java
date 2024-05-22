package br.com.modesto.singleton;

public class TestSingleton {
	public static void main(String[] args) {
		SingletonLazy s1 = SingletonLazy.getInstance();
		SingletonEagle s2 = SingletonEagle.getInstance();
		SingletonLazySyncronized s3 = SingletonLazySyncronized.getInstance();
		SingletonLazySyncronizedVolatile s4 = SingletonLazySyncronizedVolatile.getInstance();
		SingletonEnum e = SingletonEnum.INSTANCE;
		e.getSomething();
	}
}
