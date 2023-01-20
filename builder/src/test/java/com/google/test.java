package com.google;

import com.google.builder.classic.AbstractBuilder;
import com.google.builder.classic.Computer;
import com.google.builder.classic.LenovoBuilder;
import org.junit.Test;

public class test {
    @Test
    public void testClassic() {
        AbstractBuilder builder = new LenovoBuilder("best cpu", "worst display");
        builder.setMouse();
        builder.setKeyboard();
        Computer computer = builder.getComputer();
        System.out.println(computer);
    }

    @Test
    public void testNewVersion() {
        com.google.builder.newVersion.Computer computer = new com.google.builder.newVersion.Computer
                .Builder("good cpu", "best display")
                .setKeyboard("Apple keyboard")
                .setMouse("Apple mouse")
                .build();
        System.out.println(computer);
    }
}