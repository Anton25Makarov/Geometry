package com.epam.geometry.repository.specifications;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import org.junit.Assert;
import org.junit.Test;

public class IdSpecificationTest {

    private static final Cube CUBE = new Cube(2, new Point(2, 2, 2), 7);
    private static final Long ID = 7L;
    private IdSpecification idSpecification = new IdSpecification(ID);

    @Test
    public void shouldReturnTrueWhenCubeHasNeededId() {
        // given

        // when
        boolean result = idSpecification.specified(CUBE);

        // then
        Assert.assertTrue(result);
    }

}