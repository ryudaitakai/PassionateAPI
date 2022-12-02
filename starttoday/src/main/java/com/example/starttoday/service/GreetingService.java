package com.example.starttoday.service;

import com.example.starttoday.entity.GreetingEntity;

public interface GreetingService {

    GreetingEntity register(GreetingEntity greetingEntity);

    long delete(long id);
}
