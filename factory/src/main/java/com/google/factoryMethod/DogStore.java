package com.google.factoryMethod;

public class DogStore extends Store{
    @Override
    public Pet createPet(String name) {
        return new Dog(name);
    }
}
