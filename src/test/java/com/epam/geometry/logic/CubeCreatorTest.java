package com.epam.geometry.logic;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CubeCreatorTest {
    private static final String FILE_PATH_WITH_INCORRECT_LINES = "src/test/resources/cubesWithIncorrectLines.txt";
    private static final Cube FIRST_CUBE = new Cube(5, new Point(1.0, 1.0, 1.0));
    private static final Cube SECOND_CUBE = new Cube(6, new Point(2.0, 2.0, 2.0));
    private DataParser dataParser = new DataParser(new CubeValidator());


    @Test
    public void shouldCreateAndReturnArrayListOfCubesFromFileWhenFileIsExist() {
        // given
        CubeCreator cubeCreator = new CubeCreator(dataParser);

        List<Cube> expectedListOfCubes = new ArrayList<>();
        expectedListOfCubes.add(FIRST_CUBE);
        expectedListOfCubes.add(SECOND_CUBE);

        // when
        List<Cube> actualListOfCubes = cubeCreator.createCubesFromFile(FILE_PATH_WITH_INCORRECT_LINES);

        // then
        Assert.assertEquals(expectedListOfCubes, actualListOfCubes);
    }
}
