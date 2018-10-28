package com.epam.geometry.repository;

import com.epam.geometry.entities.Cube;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CubeRepository implements Repository<Cube> {

    private Map<Long, Cube> data = new HashMap<>();

    @Override
    public void add(Cube cube) {
        data.put(cube.getId(), cube);
    }

    @Override
    public void remove(Cube cube) {
        data.remove(cube.getId(), cube);
    }

    @Override
    public void update(Cube cube) {
        if (data.containsKey(cube.getId())) {
            data.put(cube.getId(), cube);
        }
    }

    @Override
    public List<Cube> sortBy(Comparator comparator) {
        Collection<Cube> dataValues = data.values();
        return dataValues.stream().
                sorted((e1, e2) -> comparator.compare(e1, e2)).collect(Collectors.toList());
    }

    @Override
    public List<Cube> findBy(Specification specification) {
        Collection<Cube> dataValues = data.values();
        return dataValues.stream().
                filter(o -> specification.specified(o)).collect(Collectors.toList());
    }

    public Map<Long, Cube> getMapOfCubes() {
        return data;
    }

    @Override
    public String toString() {
        return "CubeRepository{" +
                "data=" + data +
                '}';
    }
}
