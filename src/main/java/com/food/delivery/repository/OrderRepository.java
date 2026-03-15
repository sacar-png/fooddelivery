package com.example.fooddeliveryapi.repository;

import com.example.fooddeliveryapi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}