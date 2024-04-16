package com.example.Shop.ShopKnitting.repository.products;

import com.example.Shop.ShopKnitting.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryProductRepository {
    private List<Product> PRODUCTS = new ArrayList<>();

    public List<Product> getListProducts() {
        return PRODUCTS;
    }

    public Product saveProduct(Product product) {
        PRODUCTS.add(product);
        return product;
    }

    public Product findByTitle(String title) {
        return PRODUCTS.stream().filter(elements -> elements.getTitle()
                .equals(title))
                .findFirst()
                .orElse(null);
    }

    public Product findById(Long id) {
        return PRODUCTS.stream().filter(elements -> elements.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Product updateProduct(Product product) {
        int indexProduct = IntStream.range(0, PRODUCTS.size())
                .filter(index -> PRODUCTS.get(index).equals(product))
                .findFirst()
                .orElse(-1);
        if (indexProduct > -1)
            return PRODUCTS.set(indexProduct, product);
        else
            return null;
    }

    public void deleteProduct(Long id) {
        PRODUCTS.removeIf(elements -> elements.getId() == id);
    }
}
