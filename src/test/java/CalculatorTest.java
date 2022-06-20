import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
@Test
    public void testSum() {
    Calculator calculator = new Calculator();
    calculator.sum(10.00, 25.00);
    Assert.assertEquals(calculator.sum(10.00, 25.00),35);
}
@Test
public void testSubtract(){
    Calculator calculator = new Calculator();
    calculator.subtract(10.00, 5.00);
    Assert.assertEquals(calculator.subtract(10.00, 5.00),5.00);
}
@Test
    public void testMultiply(){
    Calculator calculator = new Calculator();
    calculator.multiply(5, 5);
    Assert.assertEquals(calculator.multiply(5, 5),25 );
}
}
