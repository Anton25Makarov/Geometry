package com.epam.geometry.repository;

import com.epam.geometry.entities.Cube;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CubeRepository implements Repository<Cube> {

    private Map<Long, Cube> data = new HashMap<>();

    @Override
    public void add(Cube obj) {
        data.put(obj.getId(), obj);
    }

    @Override
    public List<Cube> findBy(Specification specification) {
        return data.values().stream().
                filter(o -> specification.specified(o)).collect(Collectors.toList());
    }
}
