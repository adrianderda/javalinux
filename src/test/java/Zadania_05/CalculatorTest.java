package Zadania_05;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CalculatorTest {

    private Calculator calculator = new Calculator();


    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @Parameters({"addx", "addy"})
    @Test(groups = "calculate")
    public void addCorrect(double x, double y) {
        double result = calculator.add(x, y);
        AssertJUnit.assertEquals(12d, result);

    }

    @Parameters({"subx", "suby"})
    @Test(groups = "calculate")
    public void substractCorrect(double x, double y) {
        double result = calculator.substract(x, y);
        AssertJUnit.assertEquals(8d, result);
    }

    @Parameters({"divx", "divy"})
    @Test(groups = "calculate")
    public void divideCorrect(double x, double y) throws DivideByZeroExeption {
        double result = calculator.divide(x, y);
        AssertJUnit.assertEquals(5d, result);
    }

    @Parameters({"multix", "multiy"})
    @Test(groups = "calculate")
    public void multiplyCorrect(double x, double y) {
        double result = calculator.multiply(x, y);
        AssertJUnit.assertEquals(20d, result);

    }

    @Test(groups = "calculate")
    public void exceptionTest() {
        try {
            calculator.divide(10, 0);
        } catch (Exception e) {
            assertThat(e)
                    .isInstanceOf(DivideByZeroExeption.class);
        }
    }
}


