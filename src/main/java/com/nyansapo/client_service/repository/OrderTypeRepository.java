package com.nyansapo.client_service.repository;

import com.nyansapo.client_service.models.OrderType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderTypeRepository extends JpaRepository<OrderType, String> {
}
