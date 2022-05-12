package com.victorze.tacocloud.repositories;

import com.victorze.tacocloud.models.Taco;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
}

