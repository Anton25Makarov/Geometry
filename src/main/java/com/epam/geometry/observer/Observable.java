package com.epam.geometry.observer;

public interface Observable<T> {
    void addObserver(T observer);

    void removeObserver(T observer);

    void notifyObserver();
}
