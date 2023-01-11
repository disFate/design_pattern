package com.google.util;

import com.google.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class MaxConditionDisplay implements DisplayElement, Observer {
    private float maxTemperature;
    private float maxHumidity;
    private float maxPressure;

    public MaxConditionDisplay() {
        maxTemperature = 0;
        maxHumidity = 0;
        maxPressure = 0;
    }

    public void display() {
        System.out.println("---- max condition update ----" +
                "\nmaxTemperature: " + maxTemperature +
                "\nmaxHumidity: " + maxHumidity +
                "\nmaxPressure: " + maxPressure);
    }

    public void update(float temperature, float humidity, float pressure) {
        maxTemperature = Math.max(this.maxTemperature, temperature);
        maxHumidity = Math.max(this.maxHumidity, humidity);
        maxPressure = Math.max(this.maxPressure, pressure);
        display();
    }

    @Override
    public void update(Observable o, Object arg) {
        this.maxTemperature = Math.max(((WeatherData) o).getTemperature(), this.maxTemperature);
        this.maxHumidity = Math.max(((WeatherData) o).getHumidity(), this.maxHumidity);
        this.maxPressure = Math.max(((WeatherData) o).getPressure(), this.maxPressure);
        display();
    }
}
