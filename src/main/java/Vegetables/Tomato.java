package Vegetables;

public class Tomato extends Vegetable {
    private static final int TOMATO_KILOCALORIES_PER_HUNDRED_GRAMS = 19;

    public Tomato(double weight) {
        super(weight, TOMATO_KILOCALORIES_PER_HUNDRED_GRAMS);
    }

    @Override
    public double countKiloCalories() {
        return super.countKiloCalories();
    }

    @Override
    public String toString() {
        return "Tomato: " + super.toString();
    }
}
