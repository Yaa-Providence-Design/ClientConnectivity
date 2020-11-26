package com.nyansapo.client_service.controllers;


import com.nyansapo.client_service.models.Stock;
import com.nyansapo.client_service.repository.StockRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StockController {

    private final StockRepository stockRepository;

    public StockController(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @GetMapping("/stock")
    List<Stock> getAllStocks(){
        return stockRepository.findAll();
    }

    @GetMapping("stock/{id}")
    Optional<Stock> getStockById(@PathVariable Integer id){
        return stockRepository.findById(id);
    }
}
