package com.epam.geometry.repository.comparators;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.repository.Comparator;

public class CompareById implements Comparator<Cube> {

    @Override
    public int compare(Cube obj1, Cube obj2) {
        return (int) (obj1.getId() - obj2.getId());
    }
}
