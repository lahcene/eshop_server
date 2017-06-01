package com.tiramisu.eshop.rest;

import com.tiramisu.eshop.domain.ProductCategories;
import com.tiramisu.eshop.service.ProductCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lahcen on 5/17/17.
 */
@RestController
@RequestMapping("/rest/category")
public class ProductCategoriesRest {

    @Autowired
    private ProductCategoriesService productCategoriesService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<ProductCategories>> all() {
        return new ResponseEntity<List<ProductCategories>>(productCategoriesService.findAll(), HttpStatus.OK);
    }


    @RequestMapping(value = "/gender/{gender}", method = RequestMethod.GET)
    public ResponseEntity<List<Productcategories>> getCategoriesByGender(@PathVariable String gender) {
        System.out.println("+++++++++++++++ all +++++++++++");
        return new ResponseEntity<List<Productcategories>>(categoryService.getCategoriesByGender(gender), HttpStatus.OK);
    }



}