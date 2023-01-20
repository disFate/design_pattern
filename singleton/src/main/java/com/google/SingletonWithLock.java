package com.google;

public class SingletonWithLock {
    private static  SingletonWithLock singletonWithLock;
    SingletonWithLock() {}
    public static SingletonWithLock getInstance() {
        if(singletonWithLock == null) {
            synchronized (SingletonWithLock.class) {
                if(singletonWithLock == null) {
                    singletonWithLock = new SingletonWithLock();
                }
            }
        }
        return singletonWithLock;
    }
}
