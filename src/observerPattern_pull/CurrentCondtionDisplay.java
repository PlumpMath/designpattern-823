package observerPattern_pull;

import java.util.Observable;
import java.util.Observer;

public class CurrentCondtionDisplay implements Observer {
	
	WeatherData _weatherData;
	private float temp;
	private float pressure;
	
	public CurrentCondtionDisplay(WeatherData weatherData) {
		
		weatherData.addObserver(this);
		
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			this.temp = ((WeatherData) o).getTemperature();
			this.pressure = ((WeatherData) o).getPressure();
			display();
		}

	}
	
	public void display () {
		System.out.println("current condition: " + temp + "F degrees and " + pressure + "pressure");
	}
	
	

}
