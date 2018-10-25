package com.epam.geometry.observing;

public interface Observed {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
