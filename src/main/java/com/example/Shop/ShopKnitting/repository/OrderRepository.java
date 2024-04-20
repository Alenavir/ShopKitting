package com.example.Shop.ShopKnitting.repository;

import com.example.Shop.ShopKnitting.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
