package com.example.starttoday.controller;

import java.util.List;
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


    @GetMapping
    public List<GreetingEntity> get() {
        return greetingService.retrieve();
    }

    @GetMapping("/{id}")
    public GreetingEntity get(@PathVariable long id) {
        return greetingService.retrieve(id);

    @DeleteMapping("/{id}")
    public long delete(@PathVariable long id) {
        return greetingService.delete(id);
    }

    @PutMapping
    public GreetingEntity update(@RequestBody GreetingEntity greetingEntity){
        return greetingService.update(greetingEntity);

    }
}