package com.epam.geometry.repository.specifications;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.logic.Calculator;
import com.epam.geometry.repository.Specification;

public class SquareIsBetweenSpecification implements Specification<Cube> {

    private double lowSquare;
    private double highSquare;
    private Calculator calculator;

    public SquareIsBetweenSpecification(double lowSquare, double highSquare) {
        this.lowSquare = lowSquare;
        this.highSquare = highSquare;
        calculator = new Calculator();
    }

    @Override
    public boolean specified(Cube cube) {
        double currentSquare = calculator.calculateSquare(cube);

        return currentSquare >= lowSquare &&
                currentSquare <= highSquare;

    }
}
