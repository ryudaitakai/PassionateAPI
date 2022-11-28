package com.example.starttoday.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.example.starttoday.entity.GreetingEntity;
import com.example.starttoday.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping
    public GreetingEntity post(@RequestBody GreetingEntity greetingEntity) {
        return greetingService.register(greetingEntity);
    }
}