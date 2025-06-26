package arrange;

import org.junit.Test;

import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown completed");
    }
    @Test
    public void testAddition() {
        
        int a = 2;
        int b = 3;
        int result = calculator.add(a, b);

        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        int a = 5;
        int b = 2;
        int result = calculator.subtract(a, b);
        assertEquals(3, result);
    }
}

