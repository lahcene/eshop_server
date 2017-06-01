package com.tiramisu.eshop.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lahcen on 4/4/17.
 */
public abstract class AbstractService<T, ID extends Serializable> {

    JpaRepository<T, ID> repository;

    public AbstractService(JpaRepository<T, ID> jpaRepository) {
        repository = jpaRepository;
    }

    T find(ID id){
        return repository.findOne(id);
    }

    T save(T entity){
        return repository.save(entity);
    }

    List<T> save(Iterable<T> entities){
        return repository.save(entities);
    }

    boolean exists(ID id){
        return repository.exists(id);
    }

    long count(){
        return repository.count();
    }

    void delete(ID id){
        repository.delete(id);
    }

    void delete(T entity){
        repository.delete(entity);
    }
}
