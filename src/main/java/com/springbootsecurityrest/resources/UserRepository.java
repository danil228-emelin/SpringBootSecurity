package com.springbootsecurityrest.resources;

import com.springbootsecurityrest.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
List<User> findAll();

    User findUserByLogin(String login);

}
