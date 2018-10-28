package com.epam.geometry.repository;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import com.epam.geometry.repository.comparators.CompareById;
import com.epam.geometry.repository.comparators.CompareByPointX;
import com.epam.geometry.repository.comparators.CompareBySide;
import com.epam.geometry.repository.specifications.IdSpecification;
import com.epam.geometry.repository.specifications.VolumeGreaterThenSpecification;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CubeRepositoryTest {

    private final static Cube FIRST_CUBE = new Cube(3, new Point(3, 1, 1), 3);
    private final static Cube SECOND_CUBE = new Cube(2, new Point(2, 2, 2), 2);
    private final static Cube THIRD_CUBE = new Cube(1, new Point(1, 3, 3), 1);
    private Repository<Cube> repository = new CubeRepository();
    private List<Cube> cubeListForSort = new ArrayList<>();

    {
        repository.add(FIRST_CUBE);
        repository.add(SECOND_CUBE);
        repository.add(THIRD_CUBE);

        cubeListForSort.add(THIRD_CUBE);
        cubeListForSort.add(SECOND_CUBE);
        cubeListForSort.add(FIRST_CUBE);
    }

    @Test
    public void shouldFindByVolumeGreaterThenSpecification() {
        // given

        // when
        List<Cube> result = repository.findBy(new VolumeGreaterThenSpecification(1));

        // then
        Cube first = result.get(0);
        Assert.assertEquals(SECOND_CUBE, first);
    }

    @Test
    public void shouldFindByIdSpecification() {
        // given

        // when
        List<Cube> result = repository.findBy(new IdSpecification(2));

        // then
        Cube second = result.get(0);
        Assert.assertEquals(SECOND_CUBE, second);
    }

    @Test
    public void shouldSortById() {
        // given

        // when
        List<Cube> result = repository.sortBy(new CompareById());

        // then
        Assert.assertEquals(cubeListForSort, result);
    }

    @Test
    public void shouldSortByPointX() {
        // given

        // when
        List<Cube> result = repository.sortBy(new CompareByPointX());

        // then
        Assert.assertEquals(cubeListForSort, result);
    }

    @Test
    public void shouldSortBySide() {
        // given

        // when
        List<Cube> result = repository.sortBy(new CompareBySide());

        // then
        Assert.assertEquals(cubeListForSort, result);
    }
}
