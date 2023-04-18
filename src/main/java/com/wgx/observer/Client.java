package com.wgx.observer;

/**
 * @author wgx
 * @since 2023/4/18 15:14
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions();
        weatherData.registerObserver(currentConditions);

        weatherData.setData(30, 100, 20);
    }
}
