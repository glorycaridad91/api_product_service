package com.gc.api_product_service.service;

import com.gc.api_product_service.domain.Product;

public interface ProductService {
    Product getProductById(Long productId);
}
