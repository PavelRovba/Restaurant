package Salads;

import Vegetables.Vegetable;

import java.util.ArrayList;
import java.util.Collections;

public class Salad {
    private final String nameOfSalad;
    private int numberOfIngredients;
    private ArrayList<Vegetable> ingredients;
    private double totalCalories;
    private boolean withVegetableOil;

    public Salad(String nameOfSalad) {
        this.nameOfSalad = nameOfSalad;
        this.withVegetableOil = false;
        this.ingredients = new ArrayList<>(numberOfIngredients);
        this.numberOfIngredients = 0;
        totalCalories = 0;
    }


    public String getNameOfSalad() {
        return nameOfSalad;
    }

    public double getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }

    public int getNumberOfIngredients() {
        return ingredients.size();
    }

    public void setIngredients(ArrayList<Vegetable> ingredients) {
        this.ingredients = ingredients;
    }

    public void setNumberOfIngredients(int numberOfIngredients) {
        this.numberOfIngredients = numberOfIngredients;
    }

    public ArrayList<Vegetable> getIngredients() {
        return ingredients;
    }


    public void setWithVegetableOil(boolean withVegetableOil) {
        this.withVegetableOil = withVegetableOil;
    }

    public boolean isWithVegetableOil() {
        return withVegetableOil;
    }
}
