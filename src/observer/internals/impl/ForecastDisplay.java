package observer.internals.impl;

import observer.classes.WeatherData;
import observer.internals.DisplayElement;
import observer.internals.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
                lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public void display() {
		System.out.print("Прогноз: ");
		if (currentPressure > lastPressure) {
			System.out.println("Улучшение погоды в пути!");
		} else if (currentPressure == lastPressure) {
			System.out.println("Погода будет стабильной");
		} else if (currentPressure < lastPressure) {
			System.out.println("Остерегайтесь более прохладной дождливой погоды");
		}
	}
}
