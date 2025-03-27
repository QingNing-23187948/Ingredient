package com.example.ingredient;

public class Ingredient {
    private String id;
    private String name;
    private int quantity;
    private String expirationDate;
    private String category;

    // Empty constructor (required by Gson)
    public Ingredient() {
    }

    // Constructor with parameters
    public Ingredient(String id, String name, int quantity, String expirationDate, String category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.category = category;
    }

    // Getter and Setter for id
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for quantity
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter and Setter for expirationDate
    public String getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    // Getter and Setter for category
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}