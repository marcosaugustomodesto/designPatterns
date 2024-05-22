package br.com.modesto.subscriber;

import br.com.modesto.display.Display;
import br.com.modesto.observer.Observer;
import br.com.modesto.publisher.Weather;

public class HeatIndexWeather implements Observer, Display{

	private Weather weather;
	private Double heatIndex;
	
	
	public HeatIndexWeather(Weather weather) {
		this.weather = weather;
		this.weather.register(this);
	}

	@Override
	public void update(Double temperature, Double h, Double pression) {
	   Double humidity = h/100;
	   this.heatIndex = -42.379 + 2.04901523*temperature + 10.14333127*humidity - .22475541*temperature*humidity - .00683783*temperature*temperature - .05481717*humidity*humidity + .00122874*temperature*temperature*humidity + .00085282*temperature*humidity*humidity - .00000199*temperature*temperature*humidity*humidity;
	   showWeather();
		
	}

	@Override
	public void showWeather() {
		System.out.printf("Heat Index is %s F", this.heatIndex);
		System.out.println();
	}

}
