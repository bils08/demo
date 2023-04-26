package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.model.PersonMongo;
import com.example.demo.model.PersonRedis;
import com.example.demo.repository.RedisRepository;
import com.example.demo.service.PersonMongoService;
import com.example.demo.service.PersonRedisService;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    @Autowired
    private final PersonService personService;

    @Autowired
    private final PersonMongoService personMongoService;

    @Autowired
    private final RedisRepository redisRepository;

    @Autowired
    public PersonController(PersonService personService, PersonMongoService personMongoService, RedisRepository redisRepository) {
        this.personService = personService;
        this.personMongoService = personMongoService;
        this.redisRepository = redisRepository;
    }

    @GetMapping(path = "/getAllName")
    public ResponseEntity<List<String>> getAllName() {
        return ResponseEntity.status(HttpStatus.OK).body(personService.getAllName());
    }

    @PostMapping(path = "/redis")
    public ResponseEntity<PersonRedis> save(@RequestBody PersonRedis personRedis) {
        personRedis.setId(Long.valueOf(1));
        return ResponseEntity.status(HttpStatus.OK).body(redisRepository.save(personRedis));
    }

    @PostMapping
    public ResponseEntity<Person> create(@RequestBody Person person) {
//        Person person = new Person();
        person.setUuid(UUID.randomUUID());
//        person.setName(personDto.getName());
//        person.setEmail(personDto.getEmail());
//        person.setMobile(personDto.getMobile());
        personService.create(person);
        return ResponseEntity.ok(person);
    }

    @PostMapping(path = "/mongo")
    public PersonMongo create(@RequestBody PersonMongo personMongo) {
        return personMongoService.add(personMongo);
    }

    @GetMapping(path = "/mongo")
    public List<PersonMongo> findAll() {
        return personMongoService.findAll();
    }

    @GetMapping
    public List<Person> getAll() {
        return personService.getAll();
    }

    @GetMapping(path = "{id}")
    public Optional<Person> getPerson(@PathVariable("id") Long id) {
        return personService.getPerson(id);
    }

    @DeleteMapping(path = "{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return personService.delete(id);
    }

    @PutMapping(path = "{id}")
    public Person update(@PathVariable("id")Long id, @RequestBody Person person) {
        if(getPerson(id).isPresent()) {
            return personService.update(person);
        }
        return null;
    }

    @GetMapping(path = "/test")
    public List<String> testService() {
        return personService.getChar();
    }
}
