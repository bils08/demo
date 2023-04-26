package com.example.demo.model;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("PersonRedis")
public class PersonRedis implements Serializable {

    @Id
    private Long id;

    private String name;

    private String email;

    private String mobile;

}
