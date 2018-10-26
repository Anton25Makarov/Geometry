package com.epam.geometry.entities;

import com.epam.geometry.observer.Observed;
import com.epam.geometry.observer.Observer;

import java.util.*;

public class ObservedCube extends Cube implements Observed {

    private List<Observer> observers = new ArrayList<>();

    public ObservedCube(double side, Point centerPoint) {
        super(side, centerPoint);
        notifyObserver();
    }

    public ObservedCube(double side) {
        super(side);
        notifyObserver();
    }

    public ObservedCube(Cube cube) {
        super(cube);
        notifyObserver();
    }

    public void setSide(double side) {
        super.side = side;
        notifyObserver();
    }

    @Override
    public long getId() {
        return id;
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
        ObservedCube that = (ObservedCube) o;
        return id == that.id &&
                Objects.equals(observers, that.observers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, observers);
    }

    @Override
    public String toString() {
        return "ObservedCube{" +
                "id=" + id +
                ", observers=" + observers +
                '}';
    }
}
