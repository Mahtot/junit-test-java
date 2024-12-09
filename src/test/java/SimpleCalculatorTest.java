import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleCalculatorTest {
    SimpleCalculator calculator  = new SimpleCalculator();

    @Test
    void twoPlusTwoShouldEqualFour() {
        assertEquals(4, calculator.add(2,2));

    }

    @Test
    void fivePlusZeroShouldEqualFive (){
        assertTrue(calculator.add(5,0) == 5);
    }

}
