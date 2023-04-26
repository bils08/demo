package com.example.demo.service;

import com.example.demo.model.PersonRedis;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

public class PersonRedisService  {

    private static final Object HASH_KEY = "PersonRedis";
    private RedisTemplate template;

    public PersonRedis save(PersonRedis personRedis) {
        template.opsForHash().put("PersonRedis", personRedis.getId(), personRedis);
        return personRedis;
    }

    public List<PersonRedis> findAll() {
        return template.opsForHash().values(HASH_KEY);
    }

    public PersonRedis findProductById(int id) {
        return (PersonRedis) template.opsForHash().get(HASH_KEY, id);
    }

    public boolean delete(int id) {
        template.opsForHash().delete(HASH_KEY, id);
        return true;
    }
}
