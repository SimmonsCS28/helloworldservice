package com.directsupplykatainterview.helloworldservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.directsupplykatainterview.helloworldservice.dao.ProductDao;
import com.directsupplykatainterview.helloworldservice.model.ProductModel;

@Service
public class ProductService {

    private final ProductDao productDao;

    @Autowired
    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }
    
    public ProductModel getProductById(String id) {
        return productDao.getProductById(id);
    }

    public ProductModel createProduct(ProductModel product) {
        return productDao.createProduct(product);
    }

    public ProductModel updateProduct(String id, ProductModel product) {
        return productDao.updateProduct(id, product);
    }
}