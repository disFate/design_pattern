package com.google.cuisine.impl;

import com.google.cook.ICook;
import com.google.cuisine.ICuisine;

public class GuangdongCuisine implements ICuisine {
    private ICook cook;
    public GuangdongCuisine(ICook cook) {
        this.cook = cook;
    }
    @Override
    public void cook() {
        cook.doCook();
    }
}
