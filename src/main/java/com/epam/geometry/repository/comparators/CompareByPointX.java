package com.epam.geometry.repository.comparators;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import com.epam.geometry.repository.Comparator;

public class CompareByPointX implements Comparator<Cube> {

    @Override
    public int compare(Cube obj1, Cube obj2) {
        Point centerPoint1 = obj1.getCenterPoint();
        Point centerPoint2 = obj2.getCenterPoint();

        return (int) (centerPoint1.getX() - centerPoint2.getX());
    }
}
