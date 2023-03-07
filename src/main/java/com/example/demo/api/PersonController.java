package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.dto.PersonDto;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(path = "/getAllName")
    public List<String> getAllName() {
        return personService.getAllName();
    }

    @PostMapping
    public Person create(@RequestBody Person person) {
//        Person person = new Person();
//        person.setUuid(UUID.randomUUID());
//        person.setName(personDto.getName());
//        person.setEmail(personDto.getEmail());
//        person.setMobile(personDto.getMobile());
        return personService.create(person);
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
