package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    // Creating an instance of the class in test
    private final SimpleCalculator calculator = new SimpleCalculator();

    @Test
    @DisplayName("Adding two positive numbers")
    void testAddPositiveNumbers(){
        // Arranging
        int a = 5;
        int b = 3;
        int expected = 8;

        // Act
        int actual = calculator.add(a, b);

        assertEquals(expected, actual,
                "5+3 should be 8");
    }
}
