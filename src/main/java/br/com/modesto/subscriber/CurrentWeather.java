package br.com.modesto.subscriber;

import br.com.modesto.display.Display;
import br.com.modesto.observer.Observer;
import br.com.modesto.publisher.Weather;

public class CurrentWeather implements Observer, Display{

	private Weather weather;
	private Double temperature;
	private Double humidity;
	
	
	public CurrentWeather(Weather weather) {
		this.weather = weather;
		this.weather.register(this);
	}

	@Override
	public void update(Double temperature, Double humidity, Double pression) {
	   this.temperature = temperature;
	   this.humidity = humidity;
	   showWeather();
		
	}

	@Override
	public void showWeather() {
		System.out.printf("Temperature is %s F and humidity is %s", this.temperature, this.humidity);
		System.out.println();
	}

}
