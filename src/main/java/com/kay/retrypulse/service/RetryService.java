package com.kay.retrypulse.service;

import com.kay.retrypulse.external.ExternalService;
import org.springframework.stereotype.Service;

@Service
public class RetryService {

    private final ExternalService externalService;

    public RetryService(ExternalService externalService) {
        this.externalService = externalService;
    }

    public String executeWithRetry() {

        int maxAttempts = 3;
        int attempt = 0;

        while (attempt < maxAttempts) {

            try {

                System.out.println("Attempt: " + (attempt + 1));

                return externalService.callExternalService();

            } catch (Exception e) {

                attempt++;

                System.out.println("Error: " + e.getMessage());

                if (attempt == maxAttempts) {
                    return "Fallback: external service unavailable";
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {}
            }
        }

        return "Unexpected error";
    }
}