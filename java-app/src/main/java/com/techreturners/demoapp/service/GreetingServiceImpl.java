package com.techreturners.demoapp.service;

import org.springframework.stereotype.Service;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.annotation.Counted;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    @Counted(value = "counted.success.test", description = "greetCounter")
    @Timed(value = "greeting.time", description = "greetTimer")
    public String getGreeting(String name) {
        return String.format("Hey there %s, how's things going?", name);
    }

}
