package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public BasicCalculator() {
    }

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long dif(Long number1, Long number2) {
        logger.info( "Difference {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long mult(Long number1, Long number2) {
        logger.info( "Multiply {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Long div(Long number1, Long number2) {
        logger.info( "Division {} / {}", number1, number2 );
        if (number2.equals(0)){
            logger.info( "Division can't be done", number1, number2 );
            return null;
        }
        return number1 / number2;
    }

}
