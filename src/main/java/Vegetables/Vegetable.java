package Vegetables;

public abstract class Vegetable{
    private double weight;
    private double kiloCalories;

    public double getWeight() {
        return weight;
    }

    public double getKiloCalories() {
        return kiloCalories;
    }

    public Vegetable(double weight, double kiloCalories) {
        this.weight = weight;
        this.kiloCalories = kiloCalories;
    }

    public double countKiloCalories() {
        return kiloCalories * weight / 100;
    }

    @Override
    public String toString() {
        return weight +" g, kCs=" + countKiloCalories();
    }
}
