package com.example.demo.repository;

import com.example.demo.model.PersonMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMongoRepo extends MongoRepository<PersonMongo,Long> {
}
