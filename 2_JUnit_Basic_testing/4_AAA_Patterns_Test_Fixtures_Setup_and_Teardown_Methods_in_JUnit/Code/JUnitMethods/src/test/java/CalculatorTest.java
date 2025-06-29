import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @After
    public void tearDown() {
        calc.clear();
    }

    @Test
    public void testMultiply() {
        int result = calc.multiply(4, 5);

        assertEquals(20, result);
    }
}