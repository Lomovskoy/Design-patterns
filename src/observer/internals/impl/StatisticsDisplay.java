package observer.internals.impl;

import observer.classes.WeatherData;
import observer.internals.DisplayElement;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	Observable observable;

	public StatisticsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			var temp = weatherData.getTemperature();
			this.tempSum += temp;
			numReadings++;

			if (temp > maxTemp) {
				maxTemp = temp;
			}

			if (temp < minTemp) {
				minTemp = temp;
			}
			display();
		}
	}

	public void display() {
		System.out.println("Ср/Макс/Мин температура = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
