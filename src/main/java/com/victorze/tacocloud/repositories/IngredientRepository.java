package com.victorze.tacocloud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.victorze.tacocloud.models.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
