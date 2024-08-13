package com.example.weathersystem;

public class Main {
	public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.addObserver(currentDisplay);
        weatherData.addObserver(statisticsDisplay);
        weatherData.addObserver(forecastDisplay);

        weatherData.setMeasurements(25, 65, 30.4f);
        weatherData.setMeasurements(27, 70, 29.2f);
        weatherData.setMeasurements(23, 90, 29.2f);
    }
}
