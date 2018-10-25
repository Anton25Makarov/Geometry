package com.epam.geometry;

import com.epam.geometry.entities.Cube;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Director extends Observable {

    private List<Observer> cubes = new ArrayList<>();

    public void addCube(Cube cube) {
        for (Observer observer : this.cubes) {
            observer.update(this, cube);
        }
    }

    public void registry(Observer observer) {
        cubes.add(observer);
    }

}
