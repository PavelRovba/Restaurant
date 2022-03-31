package Cookers;

import Salads.Salad;
import Vegetables.Vegetable;

import java.util.ArrayList;
import java.util.Comparator;

public class SaladCooker {
    private String name;

    public SaladCooker(String name) {
        this.name = name;
    }

    public Salad makeSalad(String name) {
        return new Salad(name);
    }

    public void addIngredients(Salad salad, Vegetable... v) {
        salad.addIngredients(v);
    }

    public void addIngredient(Salad salad, Vegetable v) {
        salad.addIngredient(v);
    }

    public double countCalories(Salad salad) {
        double total = salad.getTotalCalories();
        ArrayList<Vegetable> ingredients = salad.getIngredients();
        for (Vegetable s : ingredients) salad.setTotalCalories(total += s.countKiloCalories());
        return total;
    }

    public double addVegetableOil(Salad salad, double weight) {
        double total = salad.getTotalCalories() + weight * 8.84;
        salad.setTotalCalories(total);
        salad.setWithVegetableOil(true);
        return total;
    }

    public void sortByCalories(Salad salad) {
        ArrayList<Vegetable> ingredients = salad.getIngredients();
        ingredients.sort(new Comparator<Vegetable>() {
            @Override
            public int compare(Vegetable v1, Vegetable v2) {
                return (int) (v1.getKiloCalories() - v2.getKiloCalories());
            }
        });
        System.out.println("Sorted by Calories: " + ingredients.toString());
    }

    public void sortByWeight(Salad salad) {
        ArrayList<Vegetable> ingredients = salad.getIngredients();
        ingredients.sort(new Comparator<Vegetable>() {
            @Override
            public int compare(Vegetable v1, Vegetable v2) {
                return (int) (v1.getWeight() - v2.getWeight());
            }
        });
        System.out.println("Sorted by Weight: " + ingredients.toString());
    }

    public void showInfo(Salad salad) {
        System.out.println("'" + salad.getNameOfSalad() + '\'' +
                ", number Of Ingredients= " + salad.getNumberOfIngredients() +
                ", \ningredients=" + salad.getIngredients() +
                ", \ntotal Calories=" + salad.getTotalCalories() + ", salat with VegetableOil = " +
                salad.isWithVegetableOil() + ",cooked by " + this.name);
    }
}