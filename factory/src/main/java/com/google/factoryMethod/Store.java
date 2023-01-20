package com.google.factoryMethod;

import lombok.Data;

@Data
public abstract class Store {
    private String address;
    private String name;
    public abstract Pet createPet(String name);
    public void orderPet(Pet pet) {
        pet.select();
        pet.vaccine();
        pet.transport();
    }
}
