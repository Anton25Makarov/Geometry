package com.epam.geometry;

import com.epam.geometry.entities.Cube;

public abstract class OperationObserver {

    public abstract double valueChanged(Cube observed);
}
