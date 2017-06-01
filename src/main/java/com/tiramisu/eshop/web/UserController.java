package com.tiramisu.eshop.web;

import com.tiramisu.eshop.domain.Products;
import com.tiramisu.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lahcen on 4/4/17.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/find" ,method = RequestMethod.GET)
    List<Products> findOne(){
        return productService.findAll();
    }
}
