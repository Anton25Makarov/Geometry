package com.epam.geometry.entities;

import com.epam.geometry.Generator;
import com.epam.geometry.observing.Observed;
import com.epam.geometry.observing.Observer;

import java.util.*;

public class ObservedCube extends Cube implements Observed {

    private long id;
    private List<Observer> observers = new ArrayList<>();

    public ObservedCube(double side, Point centerPoint) {
        super(side, centerPoint);
        id = Generator.generateID();
        notifyObserver();
    }

    public ObservedCube(double side) {
        super(side);
        id = Generator.generateID();
        notifyObserver();
    }

    public ObservedCube(Cube cube) {
        super(cube);
        id = Generator.generateID();
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
