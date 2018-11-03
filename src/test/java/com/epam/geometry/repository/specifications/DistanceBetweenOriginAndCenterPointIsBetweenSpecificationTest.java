package com.epam.geometry.repository.specifications;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import org.junit.Assert;
import org.junit.Test;

public class DistanceBetweenOriginAndCenterPointIsBetweenSpecificationTest {

    private static final Cube CUBE = new Cube(2, new Point(2, 2, 2));
    private DistanceBetweenOriginAndCenterPointIsBetweenSpecification distance =
            new DistanceBetweenOriginAndCenterPointIsBetweenSpecification(3,4);

    @Test
    public void shouldReturnTrueWhenDistanceBetweenOriginAndCenterPointIsBetweenSpecification() {
        // given

        // when
        boolean result = distance.specified(CUBE);

        // then
        Assert.assertTrue(result);
    }
}