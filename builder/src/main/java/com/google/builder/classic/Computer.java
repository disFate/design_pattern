package com.google.builder.classic;

public class Computer {
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public Computer(String cpu, String display) {
        this.cpu = cpu;
        this.display = display;
    }
    private String cpu;//required
    private String display;//required
    private String mouse;//not required
    private String keyboard;//not required

    @Override
    public String toString() {
        return String.format("cpu: %s, display: %s, mouse: %s, keyboard: %s", cpu, display, mouse, keyboard);
    }
}
