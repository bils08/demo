//package com.example.demo.dao;
//
//import com.example.demo.model.Person;
//import com.example.demo.repository.PersonRepository;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.query.FluentQuery;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.*;
//import java.util.function.Function;
//
//@Repository("postgres")
//public class PersonDaoImpPostgres implements PersonRepository {
//
//    private final JdbcTemplate jdbcTemplate;
//
//    List<Person> person = new ArrayList<Person>();
//
//    public PersonDaoImpPostgres(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    @Override
//    public List<Person> findAll() {
//        return null;
//    }
//
//    @Override
//    public List<Person> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<Person> findAll(Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public List<Person> findAllById(Iterable<UUID> uuids) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(UUID uuid) {
//
//    }
//
//    @Override
//    public void delete(Person entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends UUID> uuids) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Person> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public <S extends Person> S save(S entity) {
//        jdbcTemplate.update("INSERT INTO person(id, name) VALUES(?,?)", UUID.randomUUID(), entity.getName());
//        return null;
//    }
//
//
//    @Override
//    public <S extends Person> List<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<Person> findById(UUID uuid) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(UUID uuid) {
//        return false;
//    }
//
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends Person> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Person> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<Person> entities) {
//
//    }
//
//    @Override
//    public void deleteAllByIdInBatch(Iterable<UUID> uuids) {
//
//    }
//
//    @Override
//    public void deleteAllInBatch() {
//
//    }
//
//    @Override
//    public Person getOne(UUID uuid) {
//        return null;
//    }
//
//    @Override
//    public Person getById(UUID uuid) {
//        return null;
//    }
//
//    @Override
//    public Person getReferenceById(UUID uuid) {
//        return null;
//    }
//
//    @Override
//    public <S extends Person> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends Person> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends Person> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends Person> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Person> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends Person> boolean exists(Example<S> example) {
//        return false;
//    }
//
//    @Override
//    public <S extends Person, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return null;
//    }
//}
