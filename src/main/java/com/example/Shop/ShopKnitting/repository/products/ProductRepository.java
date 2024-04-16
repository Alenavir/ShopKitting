package com.example.Shop.ShopKnitting.repository.products;

import com.example.Shop.ShopKnitting.domain.Product;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByTitle(String title);
}
