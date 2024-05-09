//package com.example.Shop.ShopKnitting.services;
//
//
//import com.example.Shop.ShopKnitting.domain.OrderDetails;
//import com.example.Shop.ShopKnitting.repository.OrderDetailsRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@AllArgsConstructor
//@Service
//public class OrderDetailsService {
//    private final OrderDetailsRepository orderDetailsRepository;
//
//    // Создать новую деталь заказа при оформление заказа все продукты перезаписываются в детали заказа
//    public OrderDetails createOrderDetails(OrderDetails orderDetails) {
//        return orderDetailsRepository.save(orderDetails);
//    }
//
//
//    // Получить детали заказа по идентификатору
//    public Optional<OrderDetails> getOrderDetailsById(Long id) {
//        return orderDetailsRepository.findById(id);
//    }
//
//    // Обновить информацию о детали заказа (по сути после оформления заказа не нужен)
//    public OrderDetails updateOrderDetails(Long id, OrderDetails updatedOrderDetails) {
//        Optional<OrderDetails> optionalOrderDetails = orderDetailsRepository.findById(id);
//        if (optionalOrderDetails.isPresent()) {
//            updatedOrderDetails.setId(id);
//            return orderDetailsRepository.save(updatedOrderDetails);
//        } else {
//            return null; // или бросить исключение, если детали заказа не найдены
//        }
//    }
//
//    // Удалить детали заказа по идентификатору (по сути после оформления заказа не нужен)
//    public void deleteOrderDetails(Long id) {
//        orderDetailsRepository.deleteById(id);
//    }
//}
