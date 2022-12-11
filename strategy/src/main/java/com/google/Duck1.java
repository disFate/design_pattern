package com.google;

public class Duck1 extends Duck {

    public Duck1() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new MuteQuack();
    }
}
