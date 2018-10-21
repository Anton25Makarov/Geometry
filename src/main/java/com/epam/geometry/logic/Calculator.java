package com.epam.geometry.logic;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;

public class Calculator {

    public double calculateSquare(Cube cube) {
        return 6 * Math.pow(cube.getSide(), 2);
    }

    public double calculateVolume(Cube cube) {
        return Math.pow(cube.getSide(), 3);
    }

    public double calculateRatioVolumes(Cube cube, Point pointSeparatorY) {
        Point centerPoint = cube.getCenterPoint();

        double highestY = centerPoint.getY() + cube.getSide() / 2;
        double lowestY = centerPoint.getY() - cube.getSide() / 2;

        if (pointSeparatorY.getY() >= highestY || pointSeparatorY.getY() <= lowestY) {
            return 0; // plane XOZ on pointSeparatorY is't cross the cube plane
        }

        return ((highestY - pointSeparatorY.getY())
                / (pointSeparatorY.getY() - lowestY));
    }

    public boolean isOnCoordinatePlane(Cube cube) {
        Point centerPoint = cube.getCenterPoint();

        if ((centerPoint.getX() - cube.getSide() / 2 == 0)
                || (centerPoint.getX() + cube.getSide() / 2 == 0)) {
            return true;
        }
        if ((centerPoint.getY() - cube.getSide() / 2 == 0)
                || (centerPoint.getY() + cube.getSide() / 2 == 0)) {
            return true;
        }
        if ((centerPoint.getZ() - cube.getSide() / 2 == 0)
                || (centerPoint.getZ() + cube.getSide() / 2 == 0)) {
            return true;
        }

        return false;
    }
}
