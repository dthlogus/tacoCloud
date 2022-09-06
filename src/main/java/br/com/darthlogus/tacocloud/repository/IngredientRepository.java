package br.com.darthlogus.tacocloud.repository;

import java.util.Optional;

import br.com.darthlogus.tacocloud.model.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
