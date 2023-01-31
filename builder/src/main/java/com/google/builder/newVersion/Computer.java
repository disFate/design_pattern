package com.google.builder.newVersion;

import java.util.Arrays;

public class Computer {
    private final String cpu;
    private final String display;
    private final String keyboard;
    private final String mouse;

    //disabled constructor so must be constructed by builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.display = builder.display;
        this.keyboard = builder.keyboard;
        this.mouse = builder.mouse;
    }

    //builder should be an internal class to visit the private constructor and should
    //be static so can be visited by a class not an object
    public static class Builder {
        private String cpu;
        private String display;
        private String keyboard;
        private String mouse;

        public Builder(String cpu, String display) {
            this.cpu = cpu;
            this.display = display;
            System.out.println();
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return String.format("cpu: %s, display: %s, mouse: %s, keyboard: %s", cpu, display, mouse, keyboard);
    }
}
