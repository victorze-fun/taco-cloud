package com.victorze.tacocloud.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.victorze.tacocloud.models.Taco;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
}

