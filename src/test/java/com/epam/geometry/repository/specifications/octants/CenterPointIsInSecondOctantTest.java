package com.epam.geometry.repository.specifications.octants;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import org.junit.Assert;
import org.junit.Test;

public class CenterPointIsInSecondOctantTest {

    private static final Cube CUBE = new Cube(1, new Point(-1, 1, 1));

    @Test
    public void shouldReturnTrueWhenCenterPointIsInSecondOctant() {
        // given
        CenterPointIsInSecondOctant fifthOctantPoint = new CenterPointIsInSecondOctant();

        // when
        boolean result = fifthOctantPoint.specified(CUBE);

        // then
        Assert.assertTrue(result);
    }

}