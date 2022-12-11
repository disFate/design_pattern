package com.google;

public class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.perFormQuack();
    }

    public void performFly() {
        flyBehavior.performFly();
    }
}
