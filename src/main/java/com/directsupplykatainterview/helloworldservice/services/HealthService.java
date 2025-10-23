package com.directsupplykatainterview.helloworldservice.services;

import org.springframework.stereotype.Service;
import com.directsupplykatainterview.helloworldservice.model.HealthResponseModel;

@Service
public class HealthService {

    public HealthResponseModel getSystemHealth() {
        // Logic to determine system health can be added here
        return new HealthResponseModel("Service is up and running");
    }
}