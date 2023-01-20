package com.google.builder.classic;

public class LenovoBuilder extends AbstractBuilder{
    private Computer computer;
    public LenovoBuilder(String cpu, String display) {
        computer = new Computer(cpu, display);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("Lenovo keyboard");
    }

    @Override
    public void setMouse() {
        computer.setMouse("Lenovo mouse");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
