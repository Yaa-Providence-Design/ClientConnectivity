package com.nyansapo.client_service.repository;

import com.nyansapo.client_service.models.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository  extends JpaRepository<Portfolio, String> {
}
