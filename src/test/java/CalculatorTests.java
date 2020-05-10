import org.junit.*;

public class CalculatorTests {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int a = 20;
        int b = 30;
        int expectedResult = 50;
        long result = calculator.add(a, b);
        Assert.assertEquals(expectedResult, result);;
    }

    @Test
    public void testSubtract() {
        int a = 35;
        int b = 20;
        int expectedResult = 15;
        long result = calculator.subtract(a, b);
        Assert.assertEquals(expectedResult, result);;
    }

    @Test
    public void testMultiply() {
        int a = 100;
        int b = 25;
        long expectedResult = 2500;
        long result = calculator.multiply(a, b);
        Assert.assertEquals(expectedResult, result);;
    }

    @Test
    public void testDivide() {
        int a = 560;
        int b = 10;
        double expectedResult = 56;
        double result = calculator.divide(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int a = 1500;
        int b = 0;
        calculator.divide(a, b);
    }
}
