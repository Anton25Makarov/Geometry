package com.epam.geometry.registrator;

import com.epam.geometry.entities.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CubesRegistratorTest {

    private static final CubeObservable CUBE_OBSERVABLE_FIRST = new CubeObservable(1, new Point(1, 1, 1));
    private static final CubeObservable CUBE_OBSERVABLE_SECOND = new CubeObservable(2, new Point(1, 1, 1));
    private static final CubeValues CUBE_VALUES_FIRST = new CubeValues(0, 6, 1);
    private static final CubeValues CUBE_VALUES_SECOND = new CubeValues(1, 24, 8);
    private static final Long ID_FIRST = 0L;
    private static final Long ID_SECOND = 1L;
    private CubesRegistrator cubesRegistrator = CubesRegistrator.getInstance();
    private Map<Long, CubeValues> cubeValuesMap = new HashMap<>();

    @Before
    public void init() {
        cubeValuesMap.put(ID_FIRST, CUBE_VALUES_FIRST);
        cubeValuesMap.put(ID_SECOND, CUBE_VALUES_SECOND);
    }

    @Test
    public void shouldAddCubeValuesToMap() {
        // given
        cubesRegistrator.handleEvent(CUBE_OBSERVABLE_FIRST);
        cubesRegistrator.handleEvent(CUBE_OBSERVABLE_SECOND);

        // when
        Map<Long, CubeValues> expectedCubeValuesMap = cubesRegistrator.getCubeValuesMap();

        // then
        Assert.assertEquals(expectedCubeValuesMap, cubeValuesMap);
    }
}
