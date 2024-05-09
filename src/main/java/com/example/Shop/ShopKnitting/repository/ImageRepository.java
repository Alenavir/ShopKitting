package com.example.Shop.ShopKnitting.repository;


import com.example.Shop.ShopKnitting.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {
}
