package com.epam.geometry.repository;

import com.epam.geometry.OperationObserver;
import com.epam.geometry.entities.Cube;
import com.epam.geometry.logic.Calculator;

public class CubeSquare extends OperationObserver {

    private double square;

    @Override
    public double valueChanged(Cube observed) {
        Calculator calculator = new Calculator();
        return square = calculator.calculateSquare(observed);
    }
}
