import Cookers.SaladCooker;
import Salads.Salad;
import Vegetables.*;


public class Main {
    public static void main(String[] args) {
        SaladCooker john = new SaladCooker("John");
        Salad salad = john.makeSalad("Vegetable Salad");
        john.addIngredients(salad,new Onion(250),new Tomato(200),new Cucumber(300),new Pepper(150),new Cabbage(300));
        john.addVegetableOil(salad,10);
        john.addIngredients(salad,new Carrot(500));
        john.countCalories(salad);
        john.showInfo(salad);
        john.sortByCalories(salad);
        john.sortByWeight(salad);
        john.findByCaloriesBetween(salad,10,300);

    }
}
