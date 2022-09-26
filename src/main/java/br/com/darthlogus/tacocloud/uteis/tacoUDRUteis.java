package br.com.darthlogus.tacocloud.uteis;

import java.util.List;
import java.util.stream.Collectors;

import br.com.darthlogus.tacocloud.model.Ingredient;
import br.com.darthlogus.tacocloud.model.IngredientUDT;
import br.com.darthlogus.tacocloud.model.Taco;
import br.com.darthlogus.tacocloud.model.TacoUDT;

public class tacoUDRUteis {

    public static TacoUDT toTacoUDT(Taco taco) {
        return new TacoUDT(taco.getName(), taco.getIngredients());
    }

    public static List<IngredientUDT> toIngredientUDTs(List<Ingredient> ingredients) {
        return ingredients.stream().map(ingredient -> toIngredientUDT(ingredient)).collect(Collectors.toList());
    }

    public static IngredientUDT toIngredientUDT(Ingredient ingredient) {
        return new IngredientUDT(ingredient.getName(), ingredient.getType());
    }
}
