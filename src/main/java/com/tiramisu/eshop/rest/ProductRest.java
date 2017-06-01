package com.tiramisu.eshop.rest;

import com.tiramisu.eshop.domain.Products;
import com.tiramisu.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lahcen on 4/21/17.
 */
@RestController
@RequestMapping("/rest/product")
public class ProductRest {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody List<Products> all() {
        return productService.findAll();
    }

    @RequestMapping(value = "/all", params = {"page", "items"}, method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody List<Products> getProductsByRangeForMainActivity(@RequestParam int page, @RequestParam int items) {
        return productService.getProductsByRange(page, items);
    }

}
