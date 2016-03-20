package observerPattern;

public class WeatherStation {
	
	public static void main (String[] args) {
	WeatherData _weatherData = new WeatherData();
	
	CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(_weatherData);
	ForecastDisplay forecastDisplay = new ForecastDisplay(_weatherData);
	_weatherData.setMeasurements(12, 56, 23);
	
	}
}
