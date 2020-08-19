package observer.internals.impl;

import observer.classes.WeatherData;
import observer.internals.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;
	private float lastPressure;
	Observable observable;

	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
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

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}
}
