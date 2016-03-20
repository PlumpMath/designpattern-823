package observerPattern_pull;

import java.util.Observable;

public class WeatherData extends Observable {
	
	private float temperature;
	private float pressure;
	private float humidity;
	
	public WeatherData () {
		
	}
	
	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurementChanged(float temp, float pressure, float humidity) {
		this.temperature = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		measurementChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}
	

}
