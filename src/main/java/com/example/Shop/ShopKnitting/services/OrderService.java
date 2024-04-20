package com.example.Shop.ShopKnitting.services;

import com.example.Shop.ShopKnitting.domain.Order;
import com.example.Shop.ShopKnitting.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class OrderService {
    private final OrderRepository orderRepository;

    // Создать новый заказ при нажатии оформить заказ
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    // Получить все заказы которые когда-то были
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Получить заказ по его идентификатору
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    // Обновить информацию о заказе (если статуса заказа не будет не нужен)
    public Order updateOrder(Long id, Order updatedOrder) {
        Optional<Order> optionalOrder = orderRepository.findById(id);
        if (optionalOrder.isPresent()) {
            updatedOrder.setId(id);
            return orderRepository.save(updatedOrder);
        } else {
            return null; // или бросить исключение, если заказ не найден
        }
    }
    // Удалить заказ по его идентификатору
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

}
