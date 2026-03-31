package com.kay.retrypulse.controller;

import com.kay.retrypulse.service.RetryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetryController {

    private final RetryService retryService;

    public RetryController(RetryService retryService) {
        this.retryService = retryService;
    }

    @GetMapping("/retry")
    public String retryExample() {
        return retryService.executeWithRetry();
    }
}