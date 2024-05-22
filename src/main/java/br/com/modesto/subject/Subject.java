package br.com.modesto.subject;

import br.com.modesto.observer.Observer;

public interface Subject {
	public void register(Observer o);
	public void remove(Observer o);
	public void notifySubscribers();
}
