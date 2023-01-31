package com.google.cuisine.impl;

import com.google.cook.ICook;
import com.google.cuisine.ICuisine;

public class HubeiCuisine implements ICuisine {
    private ICook cook;
    public HubeiCuisine(ICook cook) {
        this.cook = cook;
    }
    @Override
    public void cook() {
        cook.doCook();
    }
}
