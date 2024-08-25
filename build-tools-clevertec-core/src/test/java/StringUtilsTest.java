
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.clevertec.StringUtils;

class StringUtilsTest {
    private final StringUtils stringUtils = new StringUtils();

    @Test
    void isPositiveNumber_shouldReturnTrue_whenInputIsPositiveNumber() {
        Assertions.assertTrue(StringUtils.isPositiveNumber("42"));
        Assertions.assertTrue(StringUtils.isPositiveNumber("3.14"));
    }

    @Test
    void isPositiveNumber_shouldReturnFalse_whenInputIsNegativeNumber() {
        Assertions.assertFalse(StringUtils.isPositiveNumber("-10"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("-0.5"));
    }

    @Test
    void isPositiveNumber_shouldReturnFalse_whenInputIsZero() {
        Assertions.assertFalse(StringUtils.isPositiveNumber("0"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("0.0"));
    }

    @Test
    void isPositiveNumber_shouldReturnFalse_whenInputIsNonNumeric() {
        Assertions.assertFalse(StringUtils.isPositiveNumber("abc"));
        Assertions.assertFalse(StringUtils.isPositiveNumber(""));
        Assertions.assertFalse(StringUtils.isPositiveNumber(null));
    }
}
