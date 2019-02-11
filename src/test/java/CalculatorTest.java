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

    @Test
    public void multiplyNum(){
        Calculator calculator = new Calculator(3,2);
        assertEquals(6, calculator.multiply(), 1E-8);
    }

    @Test
    public void divideNum(){
        Calculator calculator = new Calculator(9,3);
        assertEquals(3, calculator.divide(), 1E-8);
    }


    

}
