import Cookers.SaladCooker;
import Salads.Salad;
import Vegetables.Tomato;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaladCookerTest {
    private SaladCooker saladCooker;
    private Salad salad;

     @Before
    public void setUp() {
        saladCooker = new SaladCooker("Test");
        salad = new Salad("Test");
    }

    @Test
    public void countCaloriesWhenAtStartTotalCalories400ThenAdded500GramsOfTomatoes() {
        salad.setTotalCalories(400);
        saladCooker.addIngredients(salad,new Tomato(500));
        assertEquals(495, saladCooker.countCalories(salad),0.001);
    }

    @Test
    public void when100GramsVegetableOilAddedThenTotalCaloriesIncreasedBy884() {
        double result = saladCooker.addVegetableOil(salad,100);
        assertEquals(884,result,0.001);
    }

}