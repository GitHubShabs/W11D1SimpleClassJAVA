import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addNum(){
        Calculator calculator = new Calculator(3,2);
        assertEquals(5, calculator.add(), 1E-8);
    }


    @Test
    public void subtractNum(){
        Calculator calculator = new Calculator(3,2);
        assertEquals(1, calculator.subtract(), 1E-8);
    }




}
