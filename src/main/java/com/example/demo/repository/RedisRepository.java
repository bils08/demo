package com.example.demo.repository;

import com.example.demo.model.Person;
import com.example.demo.model.PersonRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.cdi.RedisRepositoryBean;
import org.springframework.data.redis.repository.support.RedisRepositoryFactoryBean;
import org.springframework.stereotype.Repository;
import com.example.demo.configuration.redisConfiguration.*;

import java.util.List;

@Repository
public class RedisRepository {

    private static final Object HASH_KEY = "PersonRedis";

    @Autowired
    private RedisTemplate template;

    public PersonRedis save(PersonRedis personRedis) {
        System.out.println("check service: " + template.getClass());
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
