package com.epam.geometry.repository.specifications;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.repository.Specification;

public class IdSpecification implements Specification<Cube> {

    private long id;

    public IdSpecification(long id) {
        this.id = id;
    }

    @Override
    public boolean specified(Cube cube) {
        return id == cube.getId();
    }
}
