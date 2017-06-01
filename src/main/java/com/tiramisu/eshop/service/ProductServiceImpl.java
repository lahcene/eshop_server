package com.tiramisu.eshop.service;

import com.tiramisu.eshop.dao.ProductRepository;
import com.tiramisu.eshop.domain.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lahcen on 4/14/17.
 */
@Service
public class ProductServiceImpl extends AbstractService<Products, Integer> implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository repository) {
        super(repository);
    }


    @Override
    public Products find(Integer integer) {
        return super.find(integer);
    }

    @Override
    public Products save(Products entity) {
        return super.save(entity);
    }

    @Override
    public List<Products> save(Iterable<Products> entities) {
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
    public void delete(Products entity) {
        super.delete(entity);
    }

    @Override
    public List<Products> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Products> getProductsByRange(int page, int items) {
        return productRepository.findAll(new PageRequest(page, items)).getContent();
    }
}
