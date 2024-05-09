package com.example.Shop.ShopKnitting.services;

import com.example.Shop.ShopKnitting.domain.Category;
import com.example.Shop.ShopKnitting.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    // Получить все категории
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Получить категорию по идентификатору
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    // Создать новую категорию
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Обновить категорию
    public Category updateCategory(Category updatedCategory) {
        return categoryRepository.save(updatedCategory);
    }

    // Удалить категорию по идентификатору
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
