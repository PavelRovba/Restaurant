package Vegetables;

public class Pepper extends Vegetable {
    private static final int PEPPER_KILOCALORIES_PER_HUNDRED_GRAMS = 27;

    public Pepper(double weight) {
        super(weight, PEPPER_KILOCALORIES_PER_HUNDRED_GRAMS);
    }

    @Override
    public double countKiloCalories() {
        return super.countKiloCalories();
    }

    @Override
    public String toString() {
        return "Pepper: " + super.toString();
    }
}
