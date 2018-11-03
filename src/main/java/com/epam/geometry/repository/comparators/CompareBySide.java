package com.epam.geometry.repository.comparators;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.repository.Comparator;

public class CompareBySide implements Comparator<Cube> {

    @Override
    public int compare(Cube objFirst, Cube objSecond) {
        return (int) (objFirst.getSide() - objSecond.getSide());
    }
}
