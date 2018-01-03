package test.java.com.tam.demo.unittestframework;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

public class BaseCalculatorTest {

    protected Calculator calculator;

    @BeforeSuite
    public void beforeSutie(){
        System.out.println("From Before Suite");
    }

    @BeforeClass
    public  void beforeClass(){
        System.out.println("From Before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("From Before Method");
    }

    @BeforeGroups(value = {"main"})
    public void beforeGroup(){
        System.out.println("before Group named main");
    }

    @BeforeClass
    public void setUp(){
        System.out.println("before class ");
        calculator = new Calculator();
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("from after method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("from after class");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("from after suite");
    }
}
