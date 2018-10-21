package com.epam.geometry.logic;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {
    private static final String VALID_STRING = "1 2.0 2.0 2.0";

    @Test
    public void shouldReturnTrueWhenStringIsValid() {
        // given
        Validator validator = new Validator();

        // when
        boolean result = validator.isValid(VALID_STRING);

        // then
        Assert.assertTrue(result);
    }
}
