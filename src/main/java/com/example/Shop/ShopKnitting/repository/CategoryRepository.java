package com.example.Shop.ShopKnitting.repository;

import com.example.Shop.ShopKnitting.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
