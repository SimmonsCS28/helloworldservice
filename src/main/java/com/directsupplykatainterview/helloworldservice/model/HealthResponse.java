package com.directsupplykatainterview.helloworldservice.model;

import java.time.Instant;

public class HealthResponse {
    private String status;
    private Instant timestamp;
    private String message;

    // Convenience constructor: create a HealthResponse with a message. Status defaults to "UP" and
    // timestamp is set to now.
    public HealthResponse(String message) {
        this.status = "UP";
        this.timestamp = Instant.now();
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}