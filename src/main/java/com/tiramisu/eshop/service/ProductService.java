package com.tiramisu.eshop.service;

import com.tiramisu.eshop.domain.Products;

import java.util.List;

/**
 * Created by lahcen on 4/14/17.
 */
public interface ProductService extends InterfaceService<Products, Integer> {

    List<Products> findAll();

    List<Products> getProductsByRange(int page, int items);
}
