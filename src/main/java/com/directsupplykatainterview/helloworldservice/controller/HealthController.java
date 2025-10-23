package com.directsupplykatainterview.helloworldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.directsupplykatainterview.helloworldservice.services.HealthService;
import com.directsupplykatainterview.helloworldservice.model.HealthResponseModel;

@RestController
@RequestMapping("/api/v1")
public class HealthController {

    private final HealthService healthService;

    @Autowired
    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping("/health")
    public ResponseEntity<HealthResponseModel> healthCheck() {
        HealthResponseModel response = healthService.getSystemHealth();
        return ResponseEntity.ok(response);
    }
}
