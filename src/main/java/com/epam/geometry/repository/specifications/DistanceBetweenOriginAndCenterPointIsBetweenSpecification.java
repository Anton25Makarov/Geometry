package com.epam.geometry.repository.specifications;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.logic.Calculator;
import com.epam.geometry.repository.Specification;

public class DistanceBetweenOriginAndCenterPointIsBetweenSpecification implements Specification<Cube> {

    private double lowDistance;
    private double highDistance;
    private Calculator calculator;

    public DistanceBetweenOriginAndCenterPointIsBetweenSpecification(double lowDistance, double highDistance) {
        this.lowDistance = lowDistance;
        this.highDistance = highDistance;
        calculator = new Calculator();
    }

    @Override
    public boolean specified(Cube cube) {
        double currentDistance = calculator.calculateDistanceBetweenOriginAndCenterPoint(cube);

        return currentDistance >= lowDistance &&
                currentDistance <= highDistance;

    }
}
