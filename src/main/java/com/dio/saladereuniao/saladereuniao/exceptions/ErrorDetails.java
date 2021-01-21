package com.dio.saladereuniao.saladereuniao.exceptions;

import java.util.Date;

public class ErrorDetails {

    // Atributos
    private Date timestamp;
    private String message;
    private String details;

    // Getters
    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    // Construtor
    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
