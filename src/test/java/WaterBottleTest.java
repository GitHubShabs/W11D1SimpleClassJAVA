import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    @Test
    public void addDrink(){
        WaterBottle waterbottle = new WaterBottle(100);
        assertEquals(90, waterbottle.drink());

    }

    





}
