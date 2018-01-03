package test.java.com.tam.demo.unittestframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiAndDivTest extends BaseCalculatorTest {

    @Test(groups = {"main"})
    public void divOneValueByOther(){
        double result = calculator.div(3d, 2d);
        Assert.assertEquals(result, 1.5d, "Invalid result");
    }

    @Test(groups = {"main"}, expectedExceptions = NumberFormatException.class)
    public void checkDivisionByZeroThrowsException(){
        double result = calculator.div(3d, 0d);
    }

}
