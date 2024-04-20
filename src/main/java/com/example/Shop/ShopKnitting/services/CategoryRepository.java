package com.example.Shop.ShopKnitting.services;

import com.example.Shop.ShopKnitting.domain.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CategoryRepository {

    private final CategoryRepository categoryRepository;

    // Получить все категории
    public List<Category> getAllCategories() {
        return categoryRepository.getAllCategories();
    }

    // Получить категорию по идентификатору
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.getCategoryById(id);
    }

    // Создать новую категорию
    public Category createCategory(Category category) {
        return categoryRepository.createCategory(category);
    }

    // Обновить категорию
    public Category updateCategory(Long id, Category updatedCategory) {
        return categoryRepository.updateCategory(id, updatedCategory);
    }

    // Удалить категорию по идентификатору
    public void deleteCategory(Long id) {
        categoryRepository.deleteCategory(id);
    }
}
