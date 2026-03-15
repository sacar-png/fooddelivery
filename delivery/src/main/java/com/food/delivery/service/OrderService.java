package com.food.delivery.service;

import com.food.delivery.model.Order;
import com.food.delivery.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order placeOrder(Order order) {
        order.setStatus("PLACED");
        return orderRepository.save(order);
    }

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
}