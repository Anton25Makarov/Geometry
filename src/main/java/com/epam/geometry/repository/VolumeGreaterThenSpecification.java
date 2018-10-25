package com.epam.geometry.repository;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.logic.Calculator;

public class VolumeGreaterThenSpecification implements Specification<Cube> {

    private double volume;
    private Calculator calculator;

    public VolumeGreaterThenSpecification(double volume) {
        this.volume = volume;
        calculator = new Calculator();
    }

    @Override
    public boolean specified(Cube obj) {
        double currentVolume = calculator.calculateVolume(obj);

        return Double.compare(currentVolume, volume) > 0;

    }
}
