package com.example.mapeo.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Getter
public class ErrorDetails {

    private LocalDateTime timestamp;

    private String message;

    private List<String> messages;

    private String details;

    public ErrorDetails(LocalDateTime timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }


    public ErrorDetails(LocalDateTime timestamp, List<String> messages, String details) {
        super();
        this.timestamp = timestamp;
        this.messages = messages;
        this.details = details;
    }
}
