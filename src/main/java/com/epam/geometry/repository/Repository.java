package com.epam.geometry.repository;

import java.util.List;

public interface Repository<T> {

    void add(T obj);
    List<T> findBy(Specification specification);
}
