package com.example.product.controller;

import com.example.product.entity.ProductEntity;
import com.example.product.service.ProductService;
import com.example.product.service.imp.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServiceImp productService;

    @GetMapping
    public ResponseEntity<?> getProduct() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> postProduct(@RequestBody ProductEntity product){

        return new ResponseEntity<>(productService.addProduct(product),HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteProduct(@RequestParam long id){

        return new ResponseEntity<>(productService.deleteProduct(id),HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateProduct(@RequestBody ProductEntity product){
        return new ResponseEntity<>(productService.updateProduct(product),HttpStatus.OK);
    }
}
