import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testDivision_positive() {
        int a = 10;
        int b = 5;
        int expected = 2;
        int actual = Calculator.divide(a, b);
        assertEquals(expected, actual);
    }
    @Test
    public void testDivision_negative() {
        int a = 10;
        int b = -5;
        int expected = -2;
        int actual = Calculator.divide(a, b);
        assertEquals(expected, actual);
    }
}
