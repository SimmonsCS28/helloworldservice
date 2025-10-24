package com.directsupplykatainterview.helloworldservice.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.directsupplykatainterview.helloworldservice.services.ProductService;
import com.directsupplykatainterview.helloworldservice.model.ProductModel;

@Component
public class ProductFacade {

    private final ProductService productService;

    @Autowired
    public ProductFacade(ProductService productService) {
        this.productService = productService;
    }

    public ProductModel getProductById(String id) {
        return productService.getProductById(id);
    }

    public ProductModel createProduct(ProductModel product) {
        return productService.createProduct(product);
    }

    public ProductModel updateProduct(String id, ProductModel product) {
        return productService.updateProduct(id, product);
    }
}