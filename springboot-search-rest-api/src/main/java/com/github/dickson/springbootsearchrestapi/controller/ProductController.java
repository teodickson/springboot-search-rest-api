package com.github.dickson.springbootsearchrestapi.controller;

import com.github.dickson.springbootsearchrestapi.entity.Product;
import com.github.dickson.springbootsearchrestapi.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products") // base url
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){
        return ResponseEntity.ok(productService.searchProducts(query));
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) { // @RequestBody will bind the http request that is json into product object
        return productService.createProduct(product);
    }
}
