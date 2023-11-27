
package calculator;

import calculator.model.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdditionOperation() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(2, 3, "+");
        assertEquals(5, result, 0);
    }

    @Test
    public void testMultiplicationOperation() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(2, 3, "*");
        assertEquals(6, result, 0);
    }

    @Test
    public void testDivisionOperation() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(6, 3, "/");
        assertEquals(2, result, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        calculator.calculate(5, 0, "/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperator() {
        Calculator calculator = new Calculator();
        calculator.calculate(5, 2, "#");
    }
}
