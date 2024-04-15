package SY2024;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UTCalculatorTest {
    UTCalculator calculator = new UTCalculator();

    @Test
    public void testAdd() {
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5,3);
        assertEquals(2, result);
    }
}
