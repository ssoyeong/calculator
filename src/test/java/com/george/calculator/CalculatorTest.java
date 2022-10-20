package com.george.calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * CalculatorTest Spring Application. */
public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }
}
