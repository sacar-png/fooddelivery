package com.food.delivery.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private Long restaurantId;
    private double total;

    @ElementCollection
    private List<Long> itemIds;
    private String status;
}