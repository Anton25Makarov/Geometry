package com.epam.geometry.repository;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import com.epam.geometry.repository.comparators.CompareByPointX;
import org.junit.Assert;
import org.junit.Test;

public class CompareByPointXTest {

    private static final Cube CUBE_FIRST = new Cube(1, new Point(1, 1, 1), 1);
    private static final Cube CUBE_SECOND = new Cube(1, new Point(2, 1, 1), 1);
    private CompareByPointX compareByPointX = new CompareByPointX();

    @Test
    public void shouldReturnTrueWhenXCoordinateOfTheFirstCubeIsLessThanXCoordinateOfTheSecondCube() {
        // given

        // when
        int result = compareByPointX.compare(CUBE_FIRST, CUBE_SECOND);

        // then
        Assert.assertTrue(result < 0);
    }

}