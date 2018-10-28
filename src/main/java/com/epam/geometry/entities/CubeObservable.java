package com.epam.geometry.entities;

import com.epam.geometry.observer.Observable;
import com.epam.geometry.observer.Observer;

import java.util.*;

public class CubeObservable extends Cube implements Observable<Observer> {

    private List<Observer> observers = new ArrayList<>();

    public CubeObservable(double side, Point centerPoint) {
        super(side, centerPoint);
        notifyObserver();
    }

    public CubeObservable(double side) {
        super(side);
        notifyObserver();
    }

    public CubeObservable(Cube cube) {
        super(cube);
        notifyObserver();
    }

    public void setSide(double side) {
        super.setSide(side);
        notifyObserver();
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.handleEvent(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CubeObservable that = (CubeObservable) o;
        return Objects.equals(observers, that.observers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), observers);
    }

    @Override
    public String toString() {
        return "CubeObservable{" +
                "observers=" + observers +
                '}';
    }
}
