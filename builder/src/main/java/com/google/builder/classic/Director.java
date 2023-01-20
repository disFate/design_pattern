package com.google.builder.classic;

public class Director {
    public Computer makeComputer(AbstractBuilder builder) {
        builder.setKeyboard();
        builder.setMouse();
        Computer computer = builder.getComputer();
        return computer;
    }
}
