package com.epam.geometry.logic;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;
import com.epam.geometry.repository.CubeRepository;
import com.epam.geometry.repository.Repository;
import com.epam.geometry.repository.Specification;
import com.epam.geometry.repository.VolumeGreaterThenSpecification;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CubeRepositoryTest {

    private final static Cube FIRST_CUBE = new Cube(5, new Point(2, 2, 2));
    Repository<Cube> repository = new CubeRepository();

    {
        repository.add(FIRST_CUBE);
    }

    @Test
    public void shouldFindByVolume() {
//        Specification<Cube> mock = Mockito.mock(Specification.class);
        List<Cube> result = repository.findBy(new VolumeGreaterThenSpecification(1));

        Assert.assertEquals(1, result.size());

        Cube first = result.get(0);
        Assert.assertEquals(FIRST_CUBE, first);
    }
}
