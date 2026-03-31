package com.kay.retrypulse.external;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ExternalService {

    private final Random random = new Random();

    public String callExternalService() {

        int chance = random.nextInt(3);

        if (chance != 0) {
            throw new RuntimeException("External service failed");
        }

        return "External service success!";
    }
}