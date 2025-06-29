import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionTest {

    @Test
    public void testAssertions() {
        assertEquals(10, 7 + 3);

        assertTrue(36 > 15);

        assertFalse(25 < 21);

        Object obj = null;
        assertNull(obj);

        Object nonNullObj = new Object();
        assertNotNull(nonNullObj);
    }
}