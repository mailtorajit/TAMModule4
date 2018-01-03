package test.java.com.tam.demo.unittestframework;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseCalculatorTest{

    @Test
    @Parameters({"firstNumber", "secondNumber", "expected"})
    public void sum(long firstNumber, long secondNumber, long expected) {
        long result = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void sumNegative() {
        long result = calculator.sum(-1, -2);
        Assert.assertEquals(result, -3);
    }


    @Test(dataProvider = "numbersProvider")
    public void sumOfNumbers(long firstNumber, long secondNumber, long expected) {
        long result = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "numbersProvider")
    public Object[][] dataprovider() {
        return new Object[][]{
                {10, 20, 30},
                {-2, -3, -5}
        };
    }

}
