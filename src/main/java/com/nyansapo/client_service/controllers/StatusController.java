package com.nyansapo.client_service.controllers;

import com.nyansapo.client_service.models.Status;
import com.nyansapo.client_service.models.Stock;
import com.nyansapo.client_service.repository.StatusRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StatusController {
    private final StatusRepository statusRepository;

    public StatusController(StatusRepository statusRepository) { this.statusRepository = statusRepository;
    }
    @GetMapping("/status")
    List<Status> getAllStatus(){ return statusRepository.findAll();
    }

    @GetMapping("status/{id}")
    Optional<Status> getStatusById(@PathVariable String id){
        return statusRepository.findById(id);
    }
}
