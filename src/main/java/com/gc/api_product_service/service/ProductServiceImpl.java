package com.gc.api_product_service.service;

import com.gc.api_product_service.domain.Product;
import com.gc.api_product_service.exception.ProductNotFoundException;
import com.gc.api_product_service.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() ->
                        new ProductNotFoundException("ProductId: " + productId + " not found"));
    }
}
