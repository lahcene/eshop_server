package com.tiramisu.eshop.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lahcen on 4/4/17.
 */
public interface InterfaceService<T, ID extends Serializable> {

    T find(ID id);

    T save(T entity);

    List<T> save(Iterable<T> entities);

    boolean exists(ID id);

    long count();

    void delete(ID id);

    void delete(T entity);
}
