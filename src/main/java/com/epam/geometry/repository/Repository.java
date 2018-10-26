package com.epam.geometry.repository;

import java.util.List;

public interface Repository<T> {

    void add(T obj);

    void remove(T obj);

    void update(T obj);

    void sortBy(Specification specification);

    List<T> findBy(Specification specification);

}
