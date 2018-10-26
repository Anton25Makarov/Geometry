package com.epam.geometry.repository.specifications.octants;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import com.epam.geometry.repository.Specification;

public class CenterPointIsInFirstOctant implements Specification<Cube> {

    @Override
    public boolean specified(Cube cube) {
        Point centerPoint = cube.getCenterPoint();

        return centerPoint.getX() > 0 &&
                centerPoint.getY() > 0 &&
                centerPoint.getZ() > 0;

    }
}
