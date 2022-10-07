package com.github.dickson.springbootsearchrestapi.service;

import com.github.dickson.springbootsearchrestapi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
