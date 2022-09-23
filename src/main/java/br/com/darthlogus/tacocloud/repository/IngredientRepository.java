package br.com.darthlogus.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.darthlogus.tacocloud.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
