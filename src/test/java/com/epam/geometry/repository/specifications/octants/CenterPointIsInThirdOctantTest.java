package com.epam.geometry.repository.specifications.octants;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import com.epam.geometry.repository.specifications.VolumeIsBetweenSpecification;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CenterPointIsInThirdOctantTest {

    private static final Cube CUBE = new Cube(1, new Point(-1, -1, 1));

    @Test
    public void shouldReturnTrueWhenCenterPointIsInThirdOctant() {
        // given
        CenterPointIsInThirdOctant eighthOctantPoint = new CenterPointIsInThirdOctant();

        // when
        boolean result = eighthOctantPoint.specified(CUBE);

        // then
        Assert.assertTrue(result);
    }
}