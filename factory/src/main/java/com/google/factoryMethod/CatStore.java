package com.google.factoryMethod;

public class CatStore extends Store{
    @Override
    public Pet createPet(String name) {
        return new Cat(name);
    }
}
