package com.epam.geometry.repository.specifications;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import org.junit.Assert;
import org.junit.Test;

public class VolumeIsBetweenSpecificationTest {

    private static final Cube CUBE = new Cube(2, new Point(1, 1, 1));
    private VolumeIsBetweenSpecification volumeIsBetween = new VolumeIsBetweenSpecification(5, 25);

    @Test
    public void shouldReturnTrueWhenVolumeOfTheCubeIsBetweenThenSpecification() {
        // given

        // when
        boolean result = volumeIsBetween.specified(CUBE);

        // then
        Assert.assertTrue(result);
    }
}