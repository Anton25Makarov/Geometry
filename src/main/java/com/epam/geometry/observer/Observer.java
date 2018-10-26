package com.epam.geometry.observer;

import com.epam.geometry.entities.ObservedCube;

public interface Observer {
    void handleEvent(ObservedCube cube);
}
