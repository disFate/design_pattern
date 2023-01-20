package com.google.factoryMethod;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dog implements Pet{
    private String name;
    @Override
    public void select() {
        System.out.println("you select the dog: " + name);
    }

    @Override
    public void vaccine() {
        System.out.println(String.format("%s get vaccine", name));
    }

    @Override
    public void transport() {
        System.out.println(String.format("%s is on delivery", name));
    }
}
