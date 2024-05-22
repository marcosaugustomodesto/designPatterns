package br.com.modesto.singleton;

public enum SingletonEnum {
	INSTANCE;

	public synchronized String getSomething() {
		return something;
	}

	private String something;
}
