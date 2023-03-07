package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

import org.assertj.core.api.AbstractAssert;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
import java.util.UUID;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    PersonRepository personRepository;

    @Spy
    @InjectMocks
    PersonService personService = new PersonService();

    @Spy
    Person personTest;

    @Spy
    Person person;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
//        personService = new PersonService(personRepository);
    }

    @Test
    void create() throws Exception {
        person = new Person();
        person.setId(Long.valueOf(99));
        person.setUuid(UUID.randomUUID());
        person.setName("Billy");
        person.setEmail("billy@ymail.com");
        person.setMobile("0864137629816651");
        personTest.setId(Long.valueOf(98));
        personTest.setUuid(UUID.randomUUID());
        personTest.setName("Billy");
        personTest.setEmail("billy@ymail.com");
        personTest.setMobile("0864137629816651");
//        personTest = Person.builder().id(Long.valueOf(99)).uuid(UUID.randomUUID()).name("Sabina").build();

        lenient().when(personService.create(person)).thenReturn(personTest);
//        when(personService.create(person)).thenReturn(new Person());
//        doCallRealMethod().when(personService)
//                .create(
//                        Mockito.any(Person.class)
//                );

        Assert.assertNotNull(person);
//        when(personService.create(isA(Person.class))).thenAnswer(invocation -> (Person) invocation.getArguments()[0]);
//        Person person1 = personRepository.save(personTest);
//        ArgumentCaptor<Person> person2 = ArgumentCaptor.forClass(Person.class);
//        verify(personService, times(10)).create(person);
        verify(personService, times(1)).create(person);
        verifyNoMoreInteractions(personService);
//
//        Person person3 = person2.getValue();
//        Assert.assertThat(person, is(personTest));
//        System.out.print(person3);
    }

}