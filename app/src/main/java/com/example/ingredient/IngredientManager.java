package com.example.ingredient;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IngredientManager {

    private static final String FILE_NAME = "ingredients.json";
    private static final Gson gson = new Gson();

    // Read the JSON file and return a list of Ingredients
    public static List<Ingredient> readIngredients(Context context) {
        File file = new File(context.getFilesDir(), FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (FileReader reader = new FileReader(file)) {
            Type listType = new TypeToken<List<Ingredient>>() {}.getType();
            List<Ingredient> ingredients = gson.fromJson(reader, listType);
            return (ingredients != null) ? ingredients : new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // Write the list back to the JSON file
    private static void writeIngredients(Context context, List<Ingredient> ingredients) {
        File file = new File(context.getFilesDir(), FILE_NAME);
        try (FileWriter writer = new FileWriter(file)) {
            gson.toJson(ingredients, writer);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Add a new ingredient
    public static void addIngredient(Context context, Ingredient newIngredient) {
        List<Ingredient> ingredients = readIngredients(context);
        ingredients.add(newIngredient);
        writeIngredients(context, ingredients);
    }

    // Update an existing ingredient
    public static void updateIngredient(Context context, Ingredient updatedIngredient) {
        List<Ingredient> ingredients = readIngredients(context);
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).getId().equals(updatedIngredient.getId())) {
                ingredients.set(i, updatedIngredient);
                break;
            }
        }
        writeIngredients(context, ingredients);
    }

    // Delete an ingredient
    public static void deleteIngredient(Context context, String ingredientId) {
        List<Ingredient> ingredients = readIngredients(context);
        Iterator<Ingredient> iterator = ingredients.iterator();
        while (iterator.hasNext()) {
            Ingredient ing = iterator.next();
            if (ing.getId().equals(ingredientId)) {
                iterator.remove();
                break;
            }
        }
        writeIngredients(context, ingredients);
    }
}