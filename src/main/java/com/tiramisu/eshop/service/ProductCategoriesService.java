package com.tiramisu.eshop.service;

import com.tiramisu.eshop.domain.ProductCategories;

import java.util.List;

/**
 * Created by lahcen on 4/20/17.
 */
public interface ProductCategoriesService extends InterfaceService<ProductCategories, Integer> {

    List<ProductCategories> findAll();
}
