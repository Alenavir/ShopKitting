package com.example.Shop.ShopKnitting.services;

import com.example.Shop.ShopKnitting.domain.Bucket;
import com.example.Shop.ShopKnitting.domain.Product;
import com.example.Shop.ShopKnitting.domain.User;
import com.example.Shop.ShopKnitting.repository.BucketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class BucketService {
    private final BucketRepository bucketRepository;


    // Метод для сохранения новой корзины
    public Bucket saveBucket(Bucket bucket) {
        return bucketRepository.save(bucket);
    }

    // Метод для удаления корзины по идентификатору
    public void deleteBucketById(Long id) {
        bucketRepository.deleteById(id);
    }

    // Метод получения корзина по ID
    public Bucket getBucketById(Long id) {
        Optional<Bucket> optionalBucket = bucketRepository.findById(id);
        return optionalBucket.orElse(null);
    }

    // Получить список продуктов в корзине по идентификатору корзины
    public List<Product> getProductsInBucket(Long bucketId) {
        Bucket bucket = bucketRepository.findById(bucketId).orElse(null);
        return (bucket != null) ? bucket.getProducts() : null;
    }

    // Добавить продукт в корзину
    public void addProductToBucket(Long bucketId, Product product) {
        Bucket bucket = bucketRepository.findById(bucketId).orElse(null);
        if (bucket != null) {
            bucket.getProducts().add(product);
            bucketRepository.save(bucket);
        }
    }

    // Удалить продукт из корзины
    public void removeProductFromBucket(Long bucketId, Product product) {
        Bucket bucket = bucketRepository.findById(bucketId).orElse(null);
        if (bucket != null) {
            bucket.getProducts().remove(product);
            bucketRepository.save(bucket);
        }
    }

    // Очистить корзину
    public void clearBucket(Long bucketId) {
        Bucket bucket = bucketRepository.findById(bucketId).orElse(null);
        if (bucket != null) {
            bucket.getProducts().clear();
            bucketRepository.save(bucket);
        }
    }

    // Получить корзину пользователя
    public Bucket getBucketByUser(User user) {
        return bucketRepository.findByUser(user);
    }

}
