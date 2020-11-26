package com.nyansapo.client_service.controllers;

import com.nyansapo.client_service.models.Portfolio;
import com.nyansapo.client_service.repository.PortfolioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PortfolioController {

    private final PortfolioRepository portfolioRepository;

    public PortfolioController(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    @GetMapping("/portfolios")
    List<Portfolio> getAllPortfolios(){
        return portfolioRepository.findAll();
    }
    @GetMapping("/portfolio/{id}")
    Optional<Portfolio> getPortfolioById(@PathVariable String id){
        return portfolioRepository.findById(id);
    }
}
