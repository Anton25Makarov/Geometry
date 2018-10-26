package com.epam.geometry.logic;

import com.epam.geometry.entities.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CubesRegistratorTest {

    private static final ObservedCube OBSERVED_CUBE = new ObservedCube(1, new Point(1, 1, 1));
    private static final CubeValues CUBE_VALUES = new CubeValues(0, 6, 1);
    private static final Long ID = 0L;
    private CubesRegistrator cubesRegistrator = new CubesRegistrator();
    private Map<Long, CubeValues> cubeValuesMap = new HashMap<>();

    @Before
    public void init() {
        cubeValuesMap.put(ID, CUBE_VALUES);
    }

    @Test
    public void shouldAddCubeValuesToMap() {
        cubesRegistrator.handleEvent(OBSERVED_CUBE);
        Assert.assertEquals(cubesRegistrator.getCubeValuesMap(), cubeValuesMap);
    }
}