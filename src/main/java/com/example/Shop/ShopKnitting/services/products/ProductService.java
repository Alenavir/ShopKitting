package com.example.Shop.ShopKnitting.services.products;

import com.example.Shop.ShopKnitting.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getListProducts();
    Product saveProduct(Product product);
    Product findByTitle(String title);
    Product findById(Long id);
    Product updateProduct(Product product);
    void deleteProduct(Long id);
}
