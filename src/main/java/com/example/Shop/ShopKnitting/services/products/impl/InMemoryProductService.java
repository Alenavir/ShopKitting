package com.example.Shop.ShopKnitting.services.products.impl;

import com.example.Shop.ShopKnitting.domain.Product;
import com.example.Shop.ShopKnitting.repository.products.InMemoryProductRepository;
import com.example.Shop.ShopKnitting.services.products.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class InMemoryProductService implements ProductService{

    private final InMemoryProductRepository productRepository;

    @Override
    public List<Product> getListProducts() {
        return null;
    }

    @Override
    public Product saveProduct(Product product) {
        return null;
    }

    @Override
    public Product findByTitle(String title) {
        return null;
    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
