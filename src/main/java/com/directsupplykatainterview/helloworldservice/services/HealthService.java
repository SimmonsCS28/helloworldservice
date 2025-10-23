package com.directsupplykatainterview.helloworldservice.services;

import org.springframework.stereotype.Service;
import com.directsupplykatainterview.helloworldservice.model.HealthResponse;

@Service
public class HealthService {

    public HealthResponse getSystemHealth() {
        // Logic to determine system health can be added here
        return new HealthResponse("Service is up and running");
    }
}