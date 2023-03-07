package com.example.demo.dto;


import lombok.Data;

import java.util.UUID;

@Data
public class PersonDto {

    private long id;

    private UUID uuid;

    private String name;

    private String email;

    private String mobile;
}
