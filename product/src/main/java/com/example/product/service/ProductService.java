package com.example.product.service;

import com.example.product.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProducts();
    boolean addProduct(ProductEntity product);
    boolean deleteProduct(long id);
    boolean updateProduct(ProductEntity product);
}
