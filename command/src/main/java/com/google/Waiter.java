package com.google;

import com.google.cuisine.ICuisine;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private final List<ICuisine> orders;
    public Waiter() {
        orders = new ArrayList<>();
    }
    public void order(ICuisine cuisine){
        orders.add(cuisine);
    }
    public void placeOrder() {
        for (ICuisine cuisine : orders) {
            cuisine.cook();
        }
        orders.clear();
    }
}
