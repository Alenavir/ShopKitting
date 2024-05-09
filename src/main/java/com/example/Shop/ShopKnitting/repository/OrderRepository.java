package com.example.Shop.ShopKnitting.repository;

import com.example.Shop.ShopKnitting.domain.Order;
import com.example.Shop.ShopKnitting.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}
