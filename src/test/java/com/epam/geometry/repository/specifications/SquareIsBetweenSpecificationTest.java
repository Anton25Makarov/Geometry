package com.epam.geometry.repository.specifications;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareIsBetweenSpecificationTest {

    private static final Cube CUBE = new Cube(2, new Point(1, 1, 1));
    private SquareIsBetweenSpecification squareIsBetween = new SquareIsBetweenSpecification(5, 25);

    @Test
    public void shouldReturnTrueWhenSquareOfTheCubeIsBetweenThenSpecification() {
        // given

        // when
        boolean result = squareIsBetween.specified(CUBE);

        // then
        Assert.assertTrue(result);
    }
}