package com.google;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay() {
        temperature = 0;
        humidity = 0;
        pressure = 0;
    }

    public void display() {
        System.out.println("---- current condition update ----" +
                "\ntemperature: " + temperature +
                "\nhumidity: " + humidity +
                "\npressure: " + pressure);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
