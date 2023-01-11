package com.google.util;

import com.google.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Observable o;

    public CurrentConditionsDisplay(Observable o) {
        this.o = o;
        o.addObserver(this);
    }

    public void display() {
        System.out.println("---- current condition update ----" +
                "\ntemperature: " + temperature +
                "\nhumidity: " + humidity +
                "\npressure: " + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.temperature = ((WeatherData) o).getTemperature();
        this.humidity = ((WeatherData) o).getHumidity();
        this.pressure = ((WeatherData) o).getPressure();
        display();
    }
}
