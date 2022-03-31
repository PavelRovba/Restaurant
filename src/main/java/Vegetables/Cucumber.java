package Vegetables;

public class Cucumber extends Vegetable {
    private static final int CUCUMBER_KILOCALORIES_PER_HUNDRED_GRAMS = 15;

    public Cucumber(double weight) {
        super(weight, CUCUMBER_KILOCALORIES_PER_HUNDRED_GRAMS);
    }

    @Override
    public double countKiloCalories() {
        return super.countKiloCalories();
    }

    @Override
    public String toString() {
        return "Cucumber: " + super.toString();
    }
}
