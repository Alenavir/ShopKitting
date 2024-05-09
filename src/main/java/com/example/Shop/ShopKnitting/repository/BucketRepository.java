package com.example.Shop.ShopKnitting.repository;

import com.example.Shop.ShopKnitting.domain.Bucket;
import com.example.Shop.ShopKnitting.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketRepository extends JpaRepository<Bucket, Long> {

    Bucket findFirstByOrderByIdDesc();
    Bucket findByUser(User user);
}
