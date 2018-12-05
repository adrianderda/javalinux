package Zadania_05;

import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.fail;


public class CalculatorTest {

    private Calculator calculator;


    @Before
    public void setUp() {
        calculator = new Calculator();
    }


    @Test
    public void addCorrect() {
        double result = calculator.add(15, 5);
        assertEquals(20d, result);

    }


    @Test
    public void substract() {
        double result = calculator.substract(15, 5);
        assertEquals(10d, result);
    }

    @Test
    public void divide() {
        double result = calculator.divide(15, 5);
        assertEquals(3d, result);
    }

    @Test
    public void multiply() {
        double result = calculator.multiply(15, 5);
        assertEquals(75d, result);

    }

    @Test()
    public void exceptionTest(){
        try {
            calculator.divide(10,0);
        } catch (Exception e) {
            assertThat(e)
                    .isInstanceOf(DivideByZeroExeption.class);
        }
    }

}


