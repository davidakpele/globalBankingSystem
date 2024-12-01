package com.example.billService.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorHandler {
    private String message;
    private int statusCode;
    private String details;
}