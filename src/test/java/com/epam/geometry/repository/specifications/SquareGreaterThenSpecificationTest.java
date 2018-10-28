package com.epam.geometry.repository.specifications;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareGreaterThenSpecificationTest {

    private static final Cube CUBE = new Cube(5, new Point(1, 1, 1));
    private SquareGreaterThenSpecification squareGreaterThen = new SquareGreaterThenSpecification(5);

    @Test
    public void shouldReturnTrueWhenSquareOfTheCubeIsGreaterThenSpecification() {
        // given

        // when
        boolean result = squareGreaterThen.specified(CUBE);

        // then
        Assert.assertTrue(result);
    }
}