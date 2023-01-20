package com.google;

public class SingletonWithSynchronized {
    private static SingletonWithSynchronized instance;
    SingletonWithSynchronized() {}
    public static synchronized SingletonWithSynchronized getInstance() {
        if (instance == null) {
            instance = new SingletonWithSynchronized();
        }
        return instance;
    }
}
