package com.directsupplykatainterview.helloworldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.directsupplykatainterview.helloworldservice.services.HealthService;
import com.directsupplykatainterview.helloworldservice.model.HealthResponseModel;
import com.directsupplykatainterview.helloworldservice.facade.HealthFacade;

@RestController
@RequestMapping("/api/v1")
public class HealthController {

    private final HealthFacade healthFacade;

    @Autowired
    public HealthController(HealthFacade healthFacade) {
        this.healthFacade = healthFacade;
    }

    @GetMapping("/health")
    public ResponseEntity<HealthResponseModel> healthCheck() {
        HealthResponseModel response = healthFacade.getHealthStatus();
        return ResponseEntity.ok(response);
    }
}
