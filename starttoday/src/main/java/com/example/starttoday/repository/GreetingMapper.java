package com.example.starttoday.repository;

import com.example.starttoday.entity.GreetingEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GreetingMapper {

    int insert(GreetingEntity greetingEntity);

    long delete(long id);

    long update(GreetingEntity greetingEntity);
}
