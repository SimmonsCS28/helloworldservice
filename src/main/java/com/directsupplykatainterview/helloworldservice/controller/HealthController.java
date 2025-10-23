package com.directsupplykatainterview.helloworldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.directsupplykatainterview.helloworldservice.services.HealthService;
import com.directsupplykatainterview.helloworldservice.model.HealthResponse;

@RestController
@RequestMapping("/api/v1")
public class HealthController {

    private final HealthService healthService;

    @Autowired
    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping("/health")
    public ResponseEntity<HealthResponse> healthCheck() {
        HealthResponse response = healthService.getSystemHealth();
        return ResponseEntity.ok(response);
    }
}
