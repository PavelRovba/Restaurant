package Vegetables;

public class Carrot extends Vegetable {
    private static final int CARROT_KILOCALORIES_PER_HUNDRED_GRAMS = 33;

    public Carrot(double weight) {
        super(weight, CARROT_KILOCALORIES_PER_HUNDRED_GRAMS);
    }

    @Override
    public double countKiloCalories() {
        return super.countKiloCalories();
    }

    @Override
    public String toString() {
        return "Carrot: " + super.toString();
    }
}
