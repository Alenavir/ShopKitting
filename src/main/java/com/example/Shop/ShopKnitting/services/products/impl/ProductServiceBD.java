package com.example.Shop.ShopKnitting.services.products.impl;

import com.example.Shop.ShopKnitting.domain.Product;
import com.example.Shop.ShopKnitting.repository.products.ProductRepository;
import com.example.Shop.ShopKnitting.services.products.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
@Primary
public class ProductServiceBD implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<Product> getListProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findByTitle(String title) {
        return productRepository.findByTitle(title);
    }

    @Override
    public Product findById(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        return optionalProduct.orElse(null);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
