package com.example.demo.service;

import com.example.demo.repository.PersonRepository;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

//    public PersonService(PersonRepository personRepository) {
//        this.personRepository = personRepository;
//    }

    public Person create(Person person) {
            return personRepository.save(person);
    }

    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public Optional<Person> getPerson(Long id) {
        return personRepository.findById(id);
    }

    public boolean delete(Long id) {
        try {
            personRepository.deleteById(id);
        } catch(Error error){
            System.out.println(error);
            return false;
        }
        return true;
    }

    public Person update(Person person) {
       return personRepository.save(person);
    }

    public List<String> getAllName() {
        return personRepository.findAll().stream().map(Person::getName).collect(Collectors.toList());
    }

    public List<Long> testService() {
        return personRepository.findAll().stream().map(Person::getId).collect(Collectors.toList());
    }

    public List<String> getChar() {
        Test characters = (list) -> list.stream().map(p -> p.charAt(0) + "A").collect(Collectors.toList());
//        Test characters = personRepository.findAll().stream().map(p -> p.getName()).map(p -> p.charAt(0)).collect(Collectors.toList());
        return characters.getChar(personRepository.findAll().stream().map(person -> person.getName()).collect(Collectors.toList()));
    }


}
