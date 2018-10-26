package com.epam.geometry.repository.specifications;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.logic.Calculator;
import com.epam.geometry.repository.Specification;

public class SquareGreaterThenSpecification implements Specification<Cube> {

    private double square;
    private Calculator calculator;

    public SquareGreaterThenSpecification(double square) {
        this.square = square;
        calculator = new Calculator();
    }

    @Override
    public boolean specified(Cube cube) {
        double currentSquare = calculator.calculateSquare(cube);

        return Double.compare(currentSquare, square) > 0;

    }
}
