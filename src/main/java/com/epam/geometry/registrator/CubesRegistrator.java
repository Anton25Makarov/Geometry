package com.epam.geometry.registrator;

import com.epam.geometry.entities.CubeObservable;
import com.epam.geometry.entities.CubeValues;
import com.epam.geometry.logic.Calculator;
import com.epam.geometry.observer.Observer;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CubesRegistrator implements Observer {

    private static CubesRegistrator instance;
    private Map<Long, CubeValues> cubeValuesMap = new HashMap<>();

    private CubesRegistrator() {
    }

    public static CubesRegistrator getInstance() {
        if (instance == null) {
            instance = new CubesRegistrator();
        }
        return instance;
    }

    @Override
    public void handleEvent(CubeObservable cube) {
        Calculator calculator = new Calculator();
        long cubeId = cube.getId();
        double square = calculator.calculateSquare(cube);
        double volume = calculator.calculateVolume(cube);
        CubeValues cubeValues = new CubeValues(cubeId, square, volume);

        cubeValuesMap.put(cubeId, cubeValues);
    }

    public Map<Long, CubeValues> getCubeValuesMap() {
        return cubeValuesMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CubesRegistrator that = (CubesRegistrator) o;
        return Objects.equals(cubeValuesMap, that.cubeValuesMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cubeValuesMap);
    }

    @Override
    public String toString() {
        return "CubesRegistrator{" +
                "cubeValuesMap=" + cubeValuesMap +
                '}';
    }
}
