package com.victorze.tacocloud.repositories;

import com.victorze.tacocloud.models.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
