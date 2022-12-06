package com.example.starttoday.service;

import com.example.starttoday.entity.GreetingEntity;

import java.util.List;

public interface GreetingService {

    GreetingEntity register(GreetingEntity greetingEntity);

    List<GreetingEntity> retrieve();

    GreetingEntity retrieve(long id);
}
