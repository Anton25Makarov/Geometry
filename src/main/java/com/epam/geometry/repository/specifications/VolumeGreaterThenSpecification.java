package com.epam.geometry.repository.specifications;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.logic.Calculator;
import com.epam.geometry.repository.Specification;

public class VolumeGreaterThenSpecification implements Specification<Cube> {

    private double volume;
    private Calculator calculator;

    public VolumeGreaterThenSpecification(double volume) {
        this.volume = volume;
        calculator = new Calculator();
    }

    @Override
    public boolean specified(Cube cube) {
        double currentVolume = calculator.calculateVolume(cube);
        return currentVolume > volume;
    }
}
