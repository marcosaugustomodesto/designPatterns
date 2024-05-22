package br.com.modesto;

import br.com.modesto.publisher.Weather;
import br.com.modesto.subscriber.AverageWeather;
import br.com.modesto.subscriber.CurrentWeather;
import br.com.modesto.subscriber.HeatIndexWeather;

public class WeatherSim {

	public static void main(String[] args) {
		Weather weather = new Weather();
		new CurrentWeather(weather);
		new AverageWeather(weather);
		new HeatIndexWeather(weather);
		weather.setWeather(80.0, 50.0, 12.0);
		weather.setWeather(82.5, 40.0, 22.0);
		weather.setWeather(85.4, 35.0, 32.0);
		weather.setWeather(78.2, 20.0, 15.0);
		weather.setWeather(73.1, 55.0, 18.0);
		weather.setWeather(50.3, 23.0, 32.0);
	}

}
