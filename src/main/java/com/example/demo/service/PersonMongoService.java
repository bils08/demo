package com.example.demo.service;

import com.example.demo.model.PersonMongo;
import com.example.demo.repository.PersonMongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonMongoService {

    @Autowired
    private PersonMongoRepo personMongoRepo;

    public PersonMongo add(PersonMongo person) {
        return personMongoRepo.save(person);
    }

    public List<PersonMongo> findAll() {
        return personMongoRepo.findAll();
    }
}
