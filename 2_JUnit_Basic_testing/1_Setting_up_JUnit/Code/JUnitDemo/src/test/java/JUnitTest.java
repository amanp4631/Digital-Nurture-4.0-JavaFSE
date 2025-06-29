import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTest {

    @Test
    public void testAdd() {
        assertEquals(40, 30 + 10);
    }
    @Test
    public void testName() {
    	assertEquals("Aman", "Aman");
    }
}