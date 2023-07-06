package com.springbootsecurityrest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity(name = "user_information")
@NoArgsConstructor
public class User {
    @Id
    private Long id;

    private String login;

    private String password;

    private String firstName;

    private String lastName;

    private Integer age;

}
