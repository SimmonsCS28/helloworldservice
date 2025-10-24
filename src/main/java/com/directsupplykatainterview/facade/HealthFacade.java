package com.directsupplykatainterview.helloworldservice.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.directsupplykatainterview.helloworldservice.services.HealthService;
import com.directsupplykatainterview.helloworldservice.model.HealthResponseModel;

@Component
public class HealthFacade {
    
    private final HealthService healthService;

    @Autowired
    public HealthFacade(HealthService healthService) {
        this.healthService = healthService;
    }

    public HealthResponseModel getHealthStatus() {
        return healthService.getSystemHealth();
    }
}