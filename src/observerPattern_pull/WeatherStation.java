package observerPattern_pull;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentCondtionDisplay _curtDisplay = new CurrentCondtionDisplay (weatherData);
		weatherData.setMeasurementChanged(10.24f, 20.85f, 302.45f);

	}

}
