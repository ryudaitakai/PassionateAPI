package com.example.starttoday.repository;

import com.example.starttoday.entity.GreetingEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GreetingMapper {

    int insert(GreetingEntity greetingEntity);

    List<GreetingEntity> selectAll();

    GreetingEntity select(long id);
}
