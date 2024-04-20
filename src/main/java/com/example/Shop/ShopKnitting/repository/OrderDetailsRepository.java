package com.example.Shop.ShopKnitting.repository;

import com.example.Shop.ShopKnitting.domain.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
}
