package com.google.factoryMethod;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cat implements Pet{
    private String name;
    @Override
    public void select() {
        System.out.println("you select a cat");
    }

    @Override
    public void vaccine() {
        System.out.println("cat get vaccine");
    }

    @Override
    public void transport() {
        System.out.println("cat is on delivery");
    }
}
