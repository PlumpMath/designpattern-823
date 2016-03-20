package observerPattern;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	
	private Subject weatherData;
	private float temp;
	private float humidity;
	
	public CurrentConditionDisplay (Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("current condition" + temp + "F degree and" + humidity + "humidity");
	}

}
