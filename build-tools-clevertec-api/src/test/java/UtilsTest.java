import org.example.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTest {

    @Test
    void testIsAllPositiveNumbersWithPositiveNumbers() {
        String[] numbers = {"1", "42", "999"};
        boolean result = Utils.isAllPositiveNumbers(numbers);
        Assertions.assertTrue(result);
    }

    @Test
    void testIsAllPositiveNumbersWithNegativeNumbers() {
        String[] numbers = {"-1", "42", "999"};
        boolean result = Utils.isAllPositiveNumbers(numbers);
        Assertions.assertFalse(result);
    }

    @Test
    void testIsAllPositiveNumbersWithMixedNumbers() {
        String[] numbers = {"1", "-42", "999"};
        boolean result = Utils.isAllPositiveNumbers(numbers);
        Assertions.assertFalse(result);
    }

    @Test
    void testIsAllPositiveNumbersWithEmptyArray() {
        String[] numbers = {};
        boolean result = Utils.isAllPositiveNumbers(numbers);
        Assertions.assertTrue(result);
    }

}
