import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Calculatortest {
    @Test
    @BeforeMethod
    public void testadd(){
        Calculator calculator = new Calculator();
        calculator.add(5, 5);
        Assert.assertEquals(calculator.add(5, 5),10);
    }
    @Test
    @BeforeMethod
    public void testSubstract(){
        Calculator calculator = new Calculator();
        calculator.substract(10, 5);
        Assert.assertEquals(calculator.substract(10, 5),5);
    }
    @Test
    @BeforeMethod
    public void testMultiply(){
        Calculator calculator = new Calculator();
        calculator.multiply(5, 5);
        Assert.assertEquals(calculator.multiply(5, 5),25 );
    }
    @Test
    @BeforeMethod
    public void testDivide(){
        Calculator calculator = new Calculator();
        calculator.divide(25, 5);
        Assert.assertEquals(calculator.divide(25, 5),5 );
    }
}
