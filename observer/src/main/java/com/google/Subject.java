package com.google;

public interface Subject {
    public void removeObserver(Observer o);

    public void addObserver(Observer o);

    public void notifyObservers();
}
