package com.github.dickson.springbootsearchrestapi.service.Impl;

import com.github.dickson.springbootsearchrestapi.entity.Product;
import com.github.dickson.springbootsearchrestapi.repository.ProductRepository;
import com.github.dickson.springbootsearchrestapi.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository; // constructor based dependency injection

    // No need @Autowired whenever it finds only one constructor for this class
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        return productRepository.searchProducts(query);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
