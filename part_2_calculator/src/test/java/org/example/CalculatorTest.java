package org.example;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testSum() {
        Calculator calculator = new Calculator();
        double[] sumArray = {1.5, 2.5, 3.5};
        assertEquals(7.5, calculator.sum(sumArray), 0.001);
    }

    public void testSubtract() {
        Calculator calculator = new Calculator();
        double[] subtractArray = {5.0, 2.0, 1.0};
        assertEquals(2.0, calculator.subtract(subtractArray), 0.001);}

    public void testMultiplication() {
        Calculator calculator = new Calculator();

        // Test case for multiplication method
        double[] multiplyArray = {2.0, 3.0, 4.0};
        assertEquals(24.0, calculator.Multiplication(multiplyArray), 0.001); // Using delta for double comparison
    }

    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.divide(10.0, 2.0), 0.001); }



}