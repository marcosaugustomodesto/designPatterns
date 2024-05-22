package br.com.modesto.subscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import br.com.modesto.display.Display;
import br.com.modesto.observer.Observer;
import br.com.modesto.publisher.Weather;

public class AverageWeather implements Observer, Display {

	private Weather weather;
	private List<Double> listTemperature = new ArrayList<>();
	private List<Double> listHumidity = new ArrayList<>();
	private List<Double> listPression = new ArrayList<>();

	public AverageWeather(Weather weather) {
		this.weather = weather;
		this.weather.register(this);
	}

	@Override
	public void update(Double temperature, Double humidity, Double pression) {
		listTemperature.add(temperature);
		listHumidity.add(humidity);
		listPression.add(pression);
		showWeather();

	}

	@Override
	public void showWeather() {
		OptionalDouble avgTemperature = listTemperature.stream().mapToDouble(x -> x).average();
		OptionalDouble avgHumidity = listHumidity.stream().mapToDouble(x -> x).average();
		OptionalDouble avgPression = listPression.stream().mapToDouble(x -> x).average();
		if (avgTemperature.isPresent() && avgHumidity.isPresent() && avgPression.isPresent()) {
			System.out.printf("Average Temperature is %s F and Average humidity is %s and Average pression is %s",
					avgTemperature.getAsDouble(), avgHumidity.getAsDouble(), avgHumidity.getAsDouble());
			System.out.println();
		}

	}

}
