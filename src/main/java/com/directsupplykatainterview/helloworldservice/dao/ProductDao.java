package com.directsupplykatainterview.helloworldservice.dao;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.directsupplykatainterview.helloworldservice.model.ProductModel;

@Repository
public class ProductDao {

    private final Map<String, ProductModel> productDatabase = new HashMap<>();

    public ProductModel createProduct(ProductModel product) {
        //add product to the product database map
        Map<String, ProductModel> db = getProductDatabase();
        db.put(product.getId(), product);
        return product;
    }

    public ProductModel getProductById(String id) {
        //get product from the database map by id
        return getProductDatabase().get(id);
    }

    public ProductModel updateProduct(String id, ProductModel product) {
        //update product in the product database map
        Map<String, ProductModel> db = getProductDatabase();
        ProductModel originalProduct = db.get(id);
        if (originalProduct == null) {
            return null; // or throw an exception
        }
        originalProduct.setName(product.getName());
        originalProduct.setDescription(product.getDescription());
        originalProduct.setPrice(product.getPrice());
        productDatabase.put(id, originalProduct);
        return originalProduct;
    }

    private Map<String, ProductModel> getProductDatabase() {
        if (productDatabase.isEmpty()) {
            productDatabase.put("1L", new ProductModel("1L", "Product 1", "Description 1", 10.0));
            productDatabase.put("2L", new ProductModel("2L", "Product 2", "Description 2", 20.0));
            productDatabase.put("3L", new ProductModel("3L", "Product 3", "Description 3", 30.0));
            productDatabase.put("4L", new ProductModel("4L", "Product 4", "Description 4", 40.0));
        }
        return productDatabase;
    }
}