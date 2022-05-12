package com.victorze.tacocloud.repositories;

import java.util.List;

import com.victorze.tacocloud.models.TacoOrder;
import com.victorze.tacocloud.models.User;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);

}
