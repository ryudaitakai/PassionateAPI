package com.example.starttoday.service.impl;

import com.example.starttoday.entity.GreetingEntity;
import com.example.starttoday.repository.GreetingMapper;
import com.example.starttoday.service.GreetingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImpl implements GreetingService {

    private GreetingMapper greetingMapper;

    public GreetingServiceImpl(GreetingMapper greetingMapper){
        this.greetingMapper = greetingMapper;
    }

    @Override
    public GreetingEntity register(GreetingEntity greetingEntity){
        greetingMapper.insert(greetingEntity);
        return greetingEntity;
    }

    @Override

    public List<GreetingEntity> retrieve() {
        return greetingMapper.selectAll();
    }

    @Override
    public GreetingEntity retrieve(long id) {
        return greetingMapper.select(id);
    }

    @Override
    public long delete(long id) {
        greetingMapper.delete(id);
        return id;
    }

    @Override
    public GreetingEntity update(GreetingEntity greetingEntity) {
        greetingMapper.update(greetingEntity);
        return greetingEntity;

    }
}
