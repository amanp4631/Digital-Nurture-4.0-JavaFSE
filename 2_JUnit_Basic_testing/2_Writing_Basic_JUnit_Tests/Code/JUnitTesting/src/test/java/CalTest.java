import org.junit.Test;
import static org.junit.Assert.*;

public class CalTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(4, 3));
    }

    @Test
    public void testIsPositive() {
        Calculator calc = new Calculator();
        assertTrue(calc.isPositive(10));
        assertFalse(calc.isPositive(-1));
    }
    
    @Test
    public void testIsNegative() {
        Calculator calc = new Calculator();
        assertTrue(calc.isNegative(-5));
        assertFalse(calc.isNegative(20));
    }
    
    @Test
    public void testIsZero() {
        Calculator calc = new Calculator();
        assertTrue(calc.isZero(0));
    }
}