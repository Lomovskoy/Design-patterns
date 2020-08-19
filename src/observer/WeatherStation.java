package observer;

import observer.classes.WeatherData;
import observer.internals.impl.CurrentConditionsDisplay;
import observer.internals.impl.ForecastDisplay;
import observer.internals.impl.HeatIndexDisplay;
import observer.internals.impl.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(32, 65, 30.4F);
        weatherData.setMeasurements(34, 70, 29.2F);
        weatherData.setMeasurements(30, 90, 29.1F);
    }
}
