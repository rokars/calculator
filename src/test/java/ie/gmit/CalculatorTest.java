package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
    }

    @Test
    void testSub() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(20, 500);
        assertEquals(480, result, 0);
    }
}
