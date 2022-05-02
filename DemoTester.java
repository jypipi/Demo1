import static org.junit.Assert.*;
import org.junit.*;

public class DemoTester {
    @Test
    public void testIfEqual() {
        assertEquals("Check if the input is equal to 1", true, Demo1.ifEqual(10));
    }
}
