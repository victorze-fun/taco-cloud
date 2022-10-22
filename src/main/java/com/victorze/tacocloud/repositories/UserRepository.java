package com.victorze.tacocloud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.victorze.tacocloud.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
