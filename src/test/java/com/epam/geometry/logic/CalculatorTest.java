package com.epam.geometry.logic;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private static final Cube CUBE = new Cube(2);
    private static final Cube CUBE_FOR_VOLUME_RATION = new Cube(10, new Point(0, 0, 0));
    private static final Cube CUBE_ON_COORDINATE_PLANE = new Cube(10, new Point(0, 5, 0));
    private static final Cube CUBE_FOR_DISTANCE = new Cube(10, new Point(5, 5, 5));
    private static final Point POINT = new Point(0, -3, 0);
    private static final double DISTANCE = 8.66;
    private static final double DELTA = 0.01;

    private Calculator calculator = new Calculator();

    @Test
    public void shouldCalculateAndReturnTwentyFourWhenSideIsTwo() {
        // given

        // when
        double result = calculator.calculateSquare(CUBE);

        //then
        Assert.assertEquals(24, result, DELTA);
    }

    @Test
    public void shouldCalculateVolumeAndReturnEightWhenSideIsTwo() {
        //given

        // when
        double result = calculator.calculateVolume(CUBE);

        // then
        Assert.assertEquals(8, result, DELTA);
    }

    @Test
    public void shouldCalculateVolumesRatioAndReturnFour() {
        // given

        // when
        double result = calculator.calculateRatioVolumes(CUBE_FOR_VOLUME_RATION, POINT);

        // then
        Assert.assertEquals(4, result, DELTA);
    }

    @Test
    public void shouldCalculateAndReturnTrueWhenCubeIsOnCoordinatePlane() {
        // given

        // when
        boolean result = calculator.isOnCoordinatePlane(CUBE_ON_COORDINATE_PLANE);

        // then
        Assert.assertTrue(result);
    }

    @Test
    public void shouldCalculateAndReturnDistanceBetweenOriginAndCenterPointOfTheCube() {
        // given

        // when
        double result = calculator.calculateDistanceBetweenOriginAndCenterPoint(CUBE_FOR_DISTANCE);

        // then
        Assert.assertEquals(DISTANCE, result, DELTA);
    }
}
