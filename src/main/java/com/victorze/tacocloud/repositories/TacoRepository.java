package com.victorze.tacocloud.repositories;

import com.victorze.tacocloud.models.Taco;

import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}

