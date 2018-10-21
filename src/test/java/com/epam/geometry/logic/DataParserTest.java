package com.epam.geometry.logic;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DataParserTest {

    private static final String VALID_STRING_FIRST = "1 2.0 2.0 2.0";
    private static final String VALID_STRING_SECOND = "2 4.0 4.0 4.0";
    private static final Cube FIRST_CUBE = new Cube(1, new Point(2.0, 2.0, 2.0));
    private static final Cube SECOND_CUBE = new Cube(2, new Point(4.0, 4.0, 4.0));


    @Test
    public void shouldReturnCubeWhenStringIsValid() {
        // given
        DataParser dataParser = new DataParser(new Validator());

        // when
        Cube cube = dataParser.parseCube(VALID_STRING_FIRST);

        // then
        Assert.assertEquals(FIRST_CUBE, cube);
    }

    @Test
    public void shouldReturnListOfCubesWhenStringsAreCorrect() {
        // given
        DataParser dataParser = new DataParser(new Validator());

        List<String> stringList = new ArrayList<>();
        stringList.add(VALID_STRING_FIRST);
        stringList.add(VALID_STRING_SECOND);

        List<Cube> expectedCubeList = new ArrayList<>();
        expectedCubeList.add(FIRST_CUBE);
        expectedCubeList.add(SECOND_CUBE);

        // when
        List<Cube> actualListOfCubes = dataParser.parseCubes(stringList);

        // then
        Assert.assertEquals(expectedCubeList, actualListOfCubes);
    }
}
