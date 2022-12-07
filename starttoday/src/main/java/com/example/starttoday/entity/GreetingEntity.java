package com.example.starttoday.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class GreetingEntity {

    private final long id;

    @NotBlank
    @Size(min=1,max=256)
    private final String content;


}
