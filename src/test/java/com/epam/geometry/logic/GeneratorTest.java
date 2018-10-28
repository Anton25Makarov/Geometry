package com.epam.geometry.logic;

import org.junit.Assert;
import org.junit.Test;

public class GeneratorTest {

    private static final long ZERO = 0L;

    @Test
    public void shouldGenerateZero() {
        // given

        // when
        long result = Generator.generateID();

        // then
        Assert.assertEquals(ZERO, result);
    }
}
