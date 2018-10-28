package com.epam.geometry.logic;

import org.junit.Assert;
import org.junit.Test;

public class CubeValidatorTest {
    private static final String VALID_STRING = "1 2.0 2.0 2.0";

    @Test
    public void shouldReturnTrueWhenStringIsValid() {
        // given
        CubeValidator cubeValidator = new CubeValidator();

        // when
        boolean result = cubeValidator.isValid(VALID_STRING);

        // then
        Assert.assertTrue(result);
    }
}
