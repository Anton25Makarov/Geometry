package com.epam.geometry.repository.specifications;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import org.junit.Assert;
import org.junit.Test;

import java.io.PipedOutputStream;

import static org.junit.Assert.*;

public class VolumeGreaterThenSpecificationTest {

    private static final Cube CUBE = new Cube(5, new Point(1, 1, 1));
    private VolumeGreaterThenSpecification volumeGreaterThen = new VolumeGreaterThenSpecification(5);


    @Test
    public void shouldReturnTrueWhenVolumeOfTheCubeIsGreaterThenSpecification() {
        // given

        // when
        boolean result = volumeGreaterThen.specified(CUBE);

        // then
        Assert.assertTrue(result);
    }
}