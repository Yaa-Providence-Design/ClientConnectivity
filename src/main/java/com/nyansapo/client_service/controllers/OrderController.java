package com.nyansapo.client_service.controllers;

import com.nyansapo.client_service.models.Order;
import com.nyansapo.client_service.models.Stock;
import com.nyansapo.client_service.repository.OrderRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {
    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/order")
    List<Order> getAllOrders() { return orderRepository.findAll();
    }

    @GetMapping("order/{id}")
    Optional<Order> getOrderById(@PathVariable String id) { return orderRepository.findById(id);
    }
}