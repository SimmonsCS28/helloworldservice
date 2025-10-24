package com.directsupplykatainterview.helloworldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.directsupplykatainterview.helloworldservice.facade.ProductFacade;
import com.directsupplykatainterview.helloworldservice.model.ProductModel;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductFacade productFacade;

    @Autowired
    public ProductController(ProductFacade productFacade) {
        this.productFacade = productFacade;
    }

    //Get Product by ID
    @GetMapping("/{id}")
    public ResponseEntity<ProductModel> getProductById(@PathVariable String id) {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        }
        ProductModel product = productFacade.getProductById(id);
        if (product == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product);
    }

    //Create Product
    @PostMapping
    public ResponseEntity<ProductModel> createProduct(@RequestBody ProductModel product) {
        if (product == null) {
            return ResponseEntity.badRequest().build();
        }
        ProductModel createdProduct = productFacade.createProduct(product);
        return ResponseEntity.ok(createdProduct);
    }

    //Update Product
    @PutMapping("/{id}")
    public ResponseEntity<ProductModel> updateProduct(@PathVariable String id, @RequestBody ProductModel product) {
        if (product == null || id == null) {
            return ResponseEntity.badRequest().build();
        }
        ProductModel updatedProduct = productFacade.updateProduct(id, product);
        if (updatedProduct == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedProduct);
    }
}
