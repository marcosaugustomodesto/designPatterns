package br.com.modesto.publisher;

import java.util.ArrayList;
import java.util.List;

import br.com.modesto.observer.Observer;
import br.com.modesto.subject.Subject;

public class Weather implements Subject{

	private List<Observer> subscribers = new ArrayList<>();
	private Double temperature;
	private Double humidity;
	private Double pression;
	
	@Override
	public void register(Observer o) {
		subscribers.add(o);
		
	}

	@Override
	public void remove(Observer o) {
		subscribers.remove(o);
	}

	@Override
	public void notifySubscribers() {
		subscribers.forEach(o -> o.update(temperature, humidity, pression));
	}
	
	public void changeWeather() {
		notifySubscribers();
	}
	
	public void setWeather(Double temperature, Double humidity, Double pression) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pression = pression;
		changeWeather();
	}

}
