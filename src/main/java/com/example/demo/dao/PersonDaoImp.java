//package com.example.demo.dao;
//
//import com.example.demo.model.Person;
//import com.example.demo.repository.PersonRepository;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.query.FluentQuery;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//import java.util.function.Function;
//
//@Repository("fakeDao")
//public class PersonDaoImp implements PersonRepository {
//
//    private static List<Person> DB = new ArrayList<>();
//
////    @Override
////    public int insertPerson(UUID id, Person person) {
////        DB.add(new Person(id, person.getName()));
////        return 1;
////    }
////
////    @Override
////    public boolean deletePerson(UUID id) {
////        Optional<Person> personOption = getPerson(id);
////        System.out.println("personOption: " + personOption.get());
////        System.out.println("isPresent: " +personOption.isPresent());
////        if (personOption.isPresent()) {
////            DB.remove(personOption.get());
////            return true;
////        }
////        return false;
////    }
////
////    @Override
////    public boolean updatePerson(UUID id, Person person) {
////        return getPerson(id)
////                .map(p -> {
////                    int indexOfPerson = DB.indexOf(p);
////                    if (indexOfPerson >= 0) {
////                        Person personUpdated = new Person(p.getId(), person.getName());
////                        DB.set(indexOfPerson, personUpdated);
////                        return true;
////                    }
////                    return false;
////                }).orElse(false);
////    }
//
////    @Override
////    public List<Person> selectAllPerson() {
////        return DB;
////    }
//
////    @Override
////    public Optional<Person> getPerson(UUID id) {
////        Optional<Person> personOption = DB.stream().filter(p -> p.getId().equals(id)).findFirst();
////        return personOption;
////    }
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
//    public <S extends Person> S save(S entity) { return null; }
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
