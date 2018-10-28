package com.epam.geometry.repository.comparators;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.repository.Comparator;

public class CompareBySide implements Comparator<Cube> {

    @Override
    public int compare(Cube obj1, Cube obj2) {
        return (int) (obj1.getSide() - obj2.getSide());
    }
}
