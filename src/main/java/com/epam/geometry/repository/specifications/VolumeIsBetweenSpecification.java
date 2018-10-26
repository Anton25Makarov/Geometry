package com.epam.geometry.repository.specifications;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.logic.Calculator;
import com.epam.geometry.repository.Specification;

public class VolumeIsBetweenSpecification implements Specification<Cube> {

    private double lowVolume;
    private double highVolume;
    private Calculator calculator;

    public VolumeIsBetweenSpecification(double lowVolume, double highVolume) {
        this.lowVolume = lowVolume;
        this.highVolume = highVolume;
        calculator = new Calculator();
    }

    @Override
    public boolean specified(Cube cube) {
        double currentVolume = calculator.calculateVolume(cube);

        return currentVolume >= lowVolume &&
                currentVolume <= highVolume;

    }
}
