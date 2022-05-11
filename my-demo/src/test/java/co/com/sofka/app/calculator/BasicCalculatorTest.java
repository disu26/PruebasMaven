package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sumTest() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing dif: 20-3=17")
    public void difTest() {
        // Arrange
        Long number1 = 20L;
        Long number2 = 3L;
        Long expectedValue = 17L;

        // Act
        Long result = basicCalculator.dif(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing mult: 5*5=25")
    public void multTest() {
        // Arrange
        Long number1 = 5L;
        Long number2 = 5L;
        Long expectedValue = 25L;

        // Act
        Long result = basicCalculator.mult(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing div: 10/5=2")
    public void divTest() {
        // Arrange
        Long number1 = 10L;
        Long number2 = 5L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.div(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    1,   -1",
            "10,    2,   8",
            "100,  85, 15",
            "50,  50, 0"
    })
    public void severalDifs(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.dif(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }
}
