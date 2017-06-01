package com.tiramisu.eshop.service;

import com.tiramisu.eshop.dao.ProductOptionsRepository;
import com.tiramisu.eshop.domain.ProductOptions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lahcen on 4/21/17.
 */
public class ProductOptionsServiceImpl extends AbstractService<ProductOptions, Integer> implements ProductOptionsService {

    @Autowired
    ProductOptionsRepository productOptionsRepository;


    public ProductOptionsServiceImpl(ProductOptionsRepository repository) {
        super(repository);
    }

    @Override
    public ProductOptions find(Integer integer) {
        return super.find(integer);
    }

    @Override
    public ProductOptions save(ProductOptions entity) {
        return super.save(entity);
    }

    @Override
    public List<ProductOptions> save(Iterable<ProductOptions> entities) {
        return super.save(entities);
    }

    @Override
    public boolean exists(Integer integer) {
        return super.exists(integer);
    }

    @Override
    public long count() {
        return super.count();
    }

    @Override
    public void delete(Integer integer) {
        super.delete(integer);
    }

    @Override
    public void delete(ProductOptions entity) {
        super.delete(entity);
    }
}
