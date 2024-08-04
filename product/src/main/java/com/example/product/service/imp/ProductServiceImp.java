package com.example.product.service.imp;

import com.example.product.entity.ProductEntity;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public boolean addProduct(ProductEntity product) {
        ProductEntity product1 = productRepository.save(product);
        boolean isValid =false;
        if (product1 != null) {
            isValid = true;
        }
        return isValid;
    }

    @Override
    public boolean deleteProduct(long id) {
      List<ProductEntity> products = productRepository.findAll();
      boolean isValid = false;
      for (ProductEntity product: products) {
          if (product.getId() == id) {
              productRepository.delete(product);
              isValid = true;
          }
      }

    return isValid;

    }

    @Override
    public boolean updateProduct(ProductEntity product) {
        List<ProductEntity> products = productRepository.findAll();
        boolean isValid = false;
        for (ProductEntity product1: products) {
            if (product1.getId() == product.getId()) {
                productRepository.save(product);
                isValid = true;
            }
        }
        return isValid;
    }


}
