import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    @Test
    public void addDrink(){
        WaterBottle waterbottle = new WaterBottle(100);
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void emptyDrink(){
        WaterBottle waterbottle = new WaterBottle(100);
        assertEquals(0, waterbottle.emptyDrink());
    }

    @Test
    public void topUpDrink(){
        WaterBottle waterbottle = new WaterBottle(60);
        assertEquals(100, waterbottle.fullDrink());
    }



}
