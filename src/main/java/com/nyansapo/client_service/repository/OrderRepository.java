package com.nyansapo.client_service.repository;

import com.nyansapo.client_service.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository <Order, String>{
}
