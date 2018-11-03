package com.epam.geometry.repository.comparators;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import com.epam.geometry.repository.Comparator;

public class CompareByPointX implements Comparator<Cube> {

    @Override
    public int compare(Cube objFirst, Cube objSecond) {
        Point centerPointFirst = objFirst.getCenterPoint();
        Point centerPointSecond = objSecond.getCenterPoint();

        return (int) (centerPointFirst.getX() - centerPointSecond.getX());
    }
}
