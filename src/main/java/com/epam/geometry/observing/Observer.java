package com.epam.geometry.observing;

import com.epam.geometry.entities.ObservedCube;

public interface Observer {
    void handleEvent(ObservedCube cube);
}
