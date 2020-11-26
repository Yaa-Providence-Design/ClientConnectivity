package com.nyansapo.client_service.controllers;

import com.nyansapo.client_service.models.OrderType;
import com.nyansapo.client_service.models.Stock;
import com.nyansapo.client_service.repository.OrderTypeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderTypeController {
    private final OrderTypeRepository orderTypeRepository;

    public OrderTypeController(OrderTypeRepository orderTypeRepository) {
        this.orderTypeRepository = orderTypeRepository;
    }
    @GetMapping("/ordertype")
    List<OrderType> getAllOrderTypes(){
        return orderTypeRepository.findAll();
    }

    @GetMapping("orderType/{id}")
    Optional<OrderType> getOrderTypeById(@PathVariable String id){ return orderTypeRepository.findById(id);
    }
}


