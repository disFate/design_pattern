package com.google;
import org.junit.Test;

public class MyTest {
    @Test
    public void test1() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
    }
}
