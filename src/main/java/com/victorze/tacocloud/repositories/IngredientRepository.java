package com.victorze.tacocloud.repositories;

import com.victorze.tacocloud.models.Ingredient;

import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
