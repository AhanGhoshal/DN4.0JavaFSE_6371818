import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestCalculator {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("New instance created!");
    }

    @After
    public void tearDown(){
        if (calculator != null)
           calculator.close();
        System.out.println("Teardown completed!\n");
    }

    @Test
    public void testAdd() {
        System.out.println("Testing add:");
        int a = 5;
        int b = 7;
        int result = calculator.add(a, b);
        assertEquals(12, result);
        System.out.println("Successful!");
    }

    @Test
    public void testSub() {
        System.out.println("Testing sub:");
        int a = 5;
        int b = 7;
        int result = calculator.sub(a, b);
        assertEquals(-2, result);
        System.out.println("Successful!");
    }

    @Test
    public void testMul() {
        System.out.println("Testing mul:");
        int a = 5;
        int b = 7;
        int result = calculator.mul(a, b);
        assertEquals(35, result);
        System.out.println("Successful!");
    }

    @Test
    public void testDiv() {
        System.out.println("Testing div:");
        int a = 10;
        int b = 2;
        double result = calculator.div(a, b);
        assertEquals(5, result, 0.0001);
        System.out.println("Successful!");
    }
}
