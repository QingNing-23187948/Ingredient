package com.example.ingredient;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;
import java.util.List;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Load the layout file activity_main.xml
        setContentView(R.layout.activity_main);

        // Optional: Set up a button to respond to user clicks
        Button btnAdd = findViewById(R.id.btn_add_ingredient);
        btnAdd.setOnClickListener(v -> {
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show();
            // You can add additional logic here, such as navigating to an "add ingredient" screen.
        });

        // -------------------------------
        // Create multiple ingredients
        // -------------------------------

        // Vegetables
        Ingredient tomato = new Ingredient(UUID.randomUUID().toString(), "Tomato", 5, "2025-03-31", "Vegetable");
        Ingredient cucumber = new Ingredient(UUID.randomUUID().toString(), "Cucumber", 3, "2025-04-15", "Vegetable");
        Ingredient carrot = new Ingredient(UUID.randomUUID().toString(), "Carrot", 10, "2025-05-10", "Vegetable");
        Ingredient broccoli = new Ingredient(UUID.randomUUID().toString(), "Broccoli", 4, "2025-07-10", "Vegetable");
        Ingredient lettuce = new Ingredient(UUID.randomUUID().toString(), "Lettuce", 3, "2025-07-05", "Vegetable");
        Ingredient zucchini = new Ingredient(UUID.randomUUID().toString(), "Zucchini", 5, "2025-08-01", "Vegetable");
        Ingredient bellPepper = new Ingredient(UUID.randomUUID().toString(), "Bell Pepper", 6, "2025-07-15", "Vegetable");
        Ingredient eggplant = new Ingredient(UUID.randomUUID().toString(), "Eggplant", 2, "2025-07-20", "Vegetable");

        // Fruits
        Ingredient apple = new Ingredient(UUID.randomUUID().toString(), "Apple", 8, "2025-06-20", "Fruit");
        Ingredient banana = new Ingredient(UUID.randomUUID().toString(), "Banana", 12, "2025-06-25", "Fruit");
        Ingredient orange = new Ingredient(UUID.randomUUID().toString(), "Orange", 7, "2025-07-05", "Fruit");
        Ingredient grapes = new Ingredient(UUID.randomUUID().toString(), "Grapes", 10, "2025-06-30", "Fruit");
        Ingredient mango = new Ingredient(UUID.randomUUID().toString(), "Mango", 4, "2025-07-25", "Fruit");
        Ingredient pineapple = new Ingredient(UUID.randomUUID().toString(), "Pineapple", 2, "2025-08-05", "Fruit");
        Ingredient kiwi = new Ingredient(UUID.randomUUID().toString(), "Kiwi", 8, "2025-07-18", "Fruit");
        Ingredient watermelon = new Ingredient(UUID.randomUUID().toString(), "Watermelon", 1, "2025-08-15", "Fruit");
        Ingredient strawberry = new Ingredient(UUID.randomUUID().toString(), "Strawberry", 20, "2025-04-05", "Fruit");

        // Dairy
        Ingredient milk = new Ingredient(UUID.randomUUID().toString(), "Milk", 2, "2025-03-10", "Dairy");
        Ingredient cheese = new Ingredient(UUID.randomUUID().toString(), "Cheese", 1, "2025-08-15", "Dairy");
        Ingredient butter = new Ingredient(UUID.randomUUID().toString(), "Butter", 1, "2025-09-01", "Dairy");
        Ingredient cream = new Ingredient(UUID.randomUUID().toString(), "Cream", 2, "2025-08-10", "Dairy");
        Ingredient yogurt = new Ingredient(UUID.randomUUID().toString(), "Yogurt", 6, "2025-05-15", "Dairy");

        // Meat
        Ingredient chicken = new Ingredient(UUID.randomUUID().toString(), "Chicken", 4, "2025-04-30", "Meat");
        Ingredient beef = new Ingredient(UUID.randomUUID().toString(), "Beef", 3, "2025-05-05", "Meat");
        Ingredient ham = new Ingredient(UUID.randomUUID().toString(), "Ham", 2, "2025-07-30", "Meat");
        Ingredient turkey = new Ingredient(UUID.randomUUID().toString(), "Turkey", 1, "2025-08-20", "Meat");
        Ingredient pork = new Ingredient(UUID.randomUUID().toString(), "Pork", 3, "2025-07-28", "Meat");
        Ingredient fish = new Ingredient(UUID.randomUUID().toString(), "Fish", 5, "2025-03-25", "Meat");

        // Seafood
        Ingredient crab = new Ingredient(UUID.randomUUID().toString(), "Crab", 5, "2025-06-15", "Seafood");
        Ingredient salmon = new Ingredient(UUID.randomUUID().toString(), "Salmon", 3, "2025-06-20", "Seafood");
        Ingredient shrimp = new Ingredient(UUID.randomUUID().toString(), "Shrimp", 10, "2025-03-20", "Seafood");

        // Grains
        Ingredient rice = new Ingredient(UUID.randomUUID().toString(), "Rice", 2, "2026-01-01", "Grain");
        Ingredient bread = new Ingredient(UUID.randomUUID().toString(), "Bread", 6, "2025-04-20", "Grain");
        Ingredient quinoa = new Ingredient(UUID.randomUUID().toString(), "Quinoa", 2, "2026-01-01", "Grain");
        Ingredient oats = new Ingredient(UUID.randomUUID().toString(), "Oats", 4, "2025-12-31", "Grain");
        Ingredient pasta = new Ingredient(UUID.randomUUID().toString(), "Pasta", 3, "2026-02-28", "Grain");

        // Nuts, Oils, and Others
        Ingredient almonds = new Ingredient(UUID.randomUUID().toString(), "Almonds", 2, "2025-12-31", "Nuts");
        Ingredient oliveOil = new Ingredient(UUID.randomUUID().toString(), "Olive Oil", 1, "2026-01-15", "Oil");
        Ingredient honey = new Ingredient(UUID.randomUUID().toString(), "Honey", 3, "2026-02-28", "Condiment");
        Ingredient tofu = new Ingredient(UUID.randomUUID().toString(), "Tofu", 2, "2025-07-10", "Protein");

        // -------------------------------
        // Add all ingredients using IngredientManager
        // -------------------------------
        IngredientManager.addIngredient(this, tomato);
        IngredientManager.addIngredient(this, cucumber);
        IngredientManager.addIngredient(this, carrot);
        IngredientManager.addIngredient(this, broccoli);
        IngredientManager.addIngredient(this, lettuce);
        IngredientManager.addIngredient(this, zucchini);
        IngredientManager.addIngredient(this, bellPepper);
        IngredientManager.addIngredient(this, eggplant);

        IngredientManager.addIngredient(this, apple);
        IngredientManager.addIngredient(this, banana);
        IngredientManager.addIngredient(this, orange);
        IngredientManager.addIngredient(this, grapes);
        IngredientManager.addIngredient(this, mango);
        IngredientManager.addIngredient(this, pineapple);
        IngredientManager.addIngredient(this, kiwi);
        IngredientManager.addIngredient(this, watermelon);
        IngredientManager.addIngredient(this, strawberry);

        IngredientManager.addIngredient(this, milk);
        IngredientManager.addIngredient(this, cheese);
        IngredientManager.addIngredient(this, butter);
        IngredientManager.addIngredient(this, cream);
        IngredientManager.addIngredient(this, yogurt);

        IngredientManager.addIngredient(this, chicken);
        IngredientManager.addIngredient(this, beef);
        IngredientManager.addIngredient(this, ham);
        IngredientManager.addIngredient(this, turkey);
        IngredientManager.addIngredient(this, pork);
        IngredientManager.addIngredient(this, fish);

        IngredientManager.addIngredient(this, crab);
        IngredientManager.addIngredient(this, salmon);
        IngredientManager.addIngredient(this, shrimp);

        IngredientManager.addIngredient(this, rice);
        IngredientManager.addIngredient(this, bread);
        IngredientManager.addIngredient(this, quinoa);
        IngredientManager.addIngredient(this, oats);
        IngredientManager.addIngredient(this, pasta);

        IngredientManager.addIngredient(this, almonds);
        IngredientManager.addIngredient(this, oliveOil);
        IngredientManager.addIngredient(this, honey);
        IngredientManager.addIngredient(this, tofu);

        // -------------------------------
        // Read all ingredients and log them to Logcat for verification
        // -------------------------------
        List<Ingredient> allIngredients = IngredientManager.readIngredients(this);
        for (Ingredient ing : allIngredients) {
            Log.d(TAG, "Ingredient: " + ing.getName() +
                    ", Quantity: " + ing.getQuantity() +
                    ", Expiration: " + ing.getExpirationDate() +
                    ", Category: " + ing.getCategory());
        }
    }}