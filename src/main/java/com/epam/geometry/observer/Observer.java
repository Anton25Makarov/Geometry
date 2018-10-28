package com.epam.geometry.observer;

import com.epam.geometry.entities.CubeObservable;

public interface Observer {
    void handleEvent(CubeObservable cube);
}
