package com.epam.geometry.repository;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import com.epam.geometry.repository.comparators.CompareBySide;
import org.junit.Assert;
import org.junit.Test;

public class CompareBySideTest {

    private static final Cube CUBE_FIRST = new Cube(1, new Point(1, 1, 1), 1);
    private static final Cube CUBE_SECOND = new Cube(2, new Point(1, 1, 1), 1);
    private CompareBySide compareBySide = new CompareBySide();

    @Test
    public void shouldReturnNegativeNumberWhenSideOfTheFirstCubeIsLessThanSideOfTheSecondCube() {
        // given

        // when
        boolean result = compareBySide.compare(CUBE_FIRST, CUBE_SECOND) < 0;

        // then
        Assert.assertTrue(result);
    }

}