package com.epam.geometry.repository;

import com.epam.geometry.entities.Cube;

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
    public void sortBy(Specification specification) {
//        data.values().stream().sorted(o -> specification.specified(o)).collect(Collectors.toList());
//        data.entrySet().stream().sorted(Map.Entry.comparingByKey());
    }

    @Override
    public List<Cube> findBy(Specification specification) {
        return data.values().stream().
                filter(o -> specification.specified(o)).collect(Collectors.toList());
    }


}
