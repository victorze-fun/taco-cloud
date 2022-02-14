package com.victorze.tacocloud.repositories;

import com.victorze.tacocloud.models.TacoOrder;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
