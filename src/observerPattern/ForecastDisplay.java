package observerPattern;

public class ForecastDisplay implements Observer {
	
	private WeatherData _weatherData;
	private float temp;
	private float pressure;
	
	public ForecastDisplay(WeatherData weatherData) {
		_weatherData = weatherData;
		_weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.pressure = pressure;
		display();

	}
	
	public void display() {
		System.out.println("current Forecast condition " + temp + "F degree and " + pressure + "pressure");
	}

}
