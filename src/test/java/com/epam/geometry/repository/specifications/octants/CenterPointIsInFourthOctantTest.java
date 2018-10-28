package com.epam.geometry.repository.specifications.octants;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import org.junit.Assert;
import org.junit.Test;

public class CenterPointIsInFourthOctantTest {

    private static final Cube CUBE = new Cube(1, new Point(1, -1, 1));

    @Test
    public void shouldReturnTrueWhenCenterPointIsInFourthOctant() {
        // given
        CenterPointIsInFourthOctant firstOctantPoint = new CenterPointIsInFourthOctant();

        // when
        boolean result = firstOctantPoint.specified(CUBE);

        // then
        Assert.assertTrue(result);
    }

}