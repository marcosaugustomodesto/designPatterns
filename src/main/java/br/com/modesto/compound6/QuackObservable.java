package br.com.modesto.compound6;

public interface QuackObservable {

	public void registerObservable(Observer observer);
	public void notifiObservers();
	
}
