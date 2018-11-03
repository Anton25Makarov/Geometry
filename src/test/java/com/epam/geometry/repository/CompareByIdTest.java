package com.epam.geometry.repository;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import com.epam.geometry.repository.comparators.CompareById;
import org.junit.Assert;
import org.junit.Test;


public class CompareByIdTest {

    private static final Cube CUBE_FIRST = new Cube(1, new Point(1, 1, 1), 1);
    private static final Cube CUBE_SECOND = new Cube(1, new Point(1, 1, 1), 2);
    private CompareById compareById = new CompareById();

    @Test
    public void shouldReturnNegativeNumberWhenIdOfTheFirstCubeIsLessThanIdOfTheSecondCube() {
        // given

        // when
        int result = compareById.compare(CUBE_FIRST, CUBE_SECOND);

        // then
        Assert.assertTrue(result < 0);
    }

}