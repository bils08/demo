package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Document("person")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PersonMongo {

    @Id
    @Field(name = "id")
    private String id;

    @Field(name = "uuid")
    private UUID uuid;

    @Field(name = "name")
    private String name;

    @Field(name = "email")
    private String email;

    @Field(name = "mobile")
    private String mobile;
}
