package com.example.Shop.ShopKnitting.repository;

import com.example.Shop.ShopKnitting.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
