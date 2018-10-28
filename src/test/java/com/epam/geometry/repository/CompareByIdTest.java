package com.epam.geometry.repository;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import com.epam.geometry.repository.comparators.CompareById;
import org.junit.Assert;
import org.junit.Test;


public class CompareByIdTest {

    private static final Cube CUBE_FIRST = new Cube(1, new Point(1, 1, 1), 1);
    private static final Cube CUBE_SECOND = new Cube(1, new Point(1, 1, 1), 2);
    private CompareById compareById = new CompareById();

    @Test
    public void shouldReturnTrueWhenIdOfTheFirstCubeIsLessThanIdOfTheSecondCube() {
        // given

        // when
        int result = compareById.compare(CUBE_FIRST, CUBE_SECOND);

        // then
        Assert.assertTrue(result < 0);
    }

      /*  CubeRepository cubeRepository = new CubeRepository();
        Cube cube1 = new Cube(1, new Point(1, 1, 1));
        Cube cube3 = new Cube(3, new Point(3, 3, 3));
        Cube cube2 = new Cube(2, new Point(2, 2, 2));
        cubeRepository.add(cube1);
        cubeRepository.add(cube2);
        cubeRepository.add(cube3);

        System.out.println(cubeRepository.toString());

        List<Cube> cubeList = cubeRepository.sortBy(new CompareById());

        System.out.println(cubeList);
*/
}