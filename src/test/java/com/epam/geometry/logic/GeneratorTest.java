package com.epam.geometry.logic;

import com.epam.geometry.Generator;
import org.junit.Assert;
import org.junit.Test;

public class GeneratorTest {

    private static final long ZERO = 0L;

    @Test
    public void shouldGenerateZero() {

        long result = Generator.generateID();
        Assert.assertEquals(ZERO, result);
    }
}
